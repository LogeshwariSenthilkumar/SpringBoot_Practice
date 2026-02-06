package com.example.P12StudentsCRUD.controller;

import com.example.P12StudentsCRUD.model.Student;
import com.example.P12StudentsCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("students/{rno}")
    public Student getStdByRno(@PathVariable int rno){
        return studentService.getStdByRno(rno);
    }
    @PostMapping("students")
    public String createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @DeleteMapping("students/{rno}")
    public String deleteStdByRno(@PathVariable int rno){
        return studentService.deleteStdByRno(rno);
    }
    @DeleteMapping("students/clear")
    public String deleteAll(){
        return studentService.deleteAll();
    }
}
