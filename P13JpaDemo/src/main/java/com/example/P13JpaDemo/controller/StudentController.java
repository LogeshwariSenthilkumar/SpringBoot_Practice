package com.example.P13JpaDemo.controller;

import com.example.P13JpaDemo.model.Student;
import com.example.P13JpaDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Student> getStdByRno(@PathVariable int rno){
        Student student=studentService.getStdByRno(rno);
        if(student==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(student,HttpStatus.OK);
        }
    }
    @PostMapping("students")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return new ResponseEntity<>("Created",HttpStatus.CREATED);
    }
    @PutMapping("students")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Updated";
    }
    @DeleteMapping("students/{rno}")
    public String deleteStdByRno(@PathVariable int rno){
        studentService.deleteStdByRno(rno);
        return "Deleted";
    }
    @DeleteMapping("students/clear")
    public String deleteAll(){
        studentService.deleteAll();
        return "cleared";
    }
    @GetMapping("students/tech/{tech}")
    public List<Student> getStdByTech(@PathVariable String tech){
        return studentService.getStdByTech(tech);
    }
    @PostMapping("students/filter")
    public List<Student> getStdByGenderAndTech(@Param("tech") String tech,@Param("gender") String gender){
        return studentService.getStdByGenderAndTech(tech,gender);
    }
}
