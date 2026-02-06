package com.example.P15CourseRegistrationSystem.service;

import com.example.P15CourseRegistrationSystem.model.Course;
import com.example.P15CourseRegistrationSystem.model.CourseReg;
import com.example.P15CourseRegistrationSystem.repo.CourseRegRepo;
import com.example.P15CourseRegistrationSystem.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRegRepo courseRegRepo;
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    public List<CourseReg> getEnrolledStds() {
        return courseRegRepo.findAll();
    }

    public String createReg(String name, String emailId, String courseName) {
        CourseReg courseReg=new CourseReg(name,courseName,emailId);
        courseRegRepo.save(courseReg);
        return "Congratulations! "+name+" Successfully Enrolled for "+courseName;
    }
}
