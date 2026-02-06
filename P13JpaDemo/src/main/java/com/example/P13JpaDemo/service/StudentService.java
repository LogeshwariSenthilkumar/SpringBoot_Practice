package com.example.P13JpaDemo.service;

import com.example.P13JpaDemo.model.Student;
import com.example.P13JpaDemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    public Student getStdByRno(int rno) {
        return studentRepo.findById(rno).orElse(null);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStdByRno(int rno) {
        studentRepo.deleteById(rno);
    }

    public void deleteAll() {
        studentRepo.deleteAll();
    }

    public List<Student> getStdByTech(String tech) {
        return studentRepo.findByTech(tech);
    }

    public List<Student> getStdByGenderAndTech(String tech, String gender) {
        return studentRepo.findByGenderAndTech(gender,tech);
    }
}
