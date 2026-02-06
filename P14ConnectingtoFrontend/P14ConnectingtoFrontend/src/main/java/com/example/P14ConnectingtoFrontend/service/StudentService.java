package com.example.P14ConnectingtoFrontend.service;

import com.example.P14ConnectingtoFrontend.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students=new ArrayList<>(
            Arrays.asList(new Student(101,"Dharanesh","Java"),new Student(102,"Logu","Java"))
    );
    public List<Student> getStudents() {
        return students;
    }

    public String createStudent(int rno, String name, String tech) {
        Student student=new Student(rno,name,tech);
        students.add(student);
        return "Created...";
    }
}
