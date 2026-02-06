package com.example.P14ConnectingtoFrontend.controller;

import com.example.P14ConnectingtoFrontend.model.Student;
import com.example.P14ConnectingtoFrontend.service.StudentService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @PostMapping("students")
    public String createStudent(@PathParam("rno") int rno, @PathParam("name") String name,@PathParam("tech") String tech){
        return studentService.createStudent(rno,name,tech);
    }
}
