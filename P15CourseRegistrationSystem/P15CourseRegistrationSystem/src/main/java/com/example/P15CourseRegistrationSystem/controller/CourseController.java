package com.example.P15CourseRegistrationSystem.controller;

import com.example.P15CourseRegistrationSystem.model.Course;
import com.example.P15CourseRegistrationSystem.model.CourseReg;
import com.example.P15CourseRegistrationSystem.service.CourseService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    @GetMapping("courses/enrolled")
    public List<CourseReg> getEnrolledStds(){
        return courseService.getEnrolledStds();
    }
    @PostMapping("courses/register")
    public String CreateReg(@PathParam("name") String name,@PathParam("email") String emailId,@PathParam("courseName") String courseName){
            return courseService.createReg(name,emailId,courseName);

    }
}
