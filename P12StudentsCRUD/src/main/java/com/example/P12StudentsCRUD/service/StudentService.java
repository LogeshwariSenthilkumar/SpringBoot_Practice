package com.example.P12StudentsCRUD.service;

import com.example.P12StudentsCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students=new ArrayList<>(
            Arrays.asList(new Student(101,"Dharanesh","Python"),new Student(102,"Logu","Java"))
    );
    public List<Student> getStudents() {
        return students;
    }

    public Student getStdByRno(int rno) {
        int index=0;
        boolean found=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==rno){
                found=true;
                index=i;
                break;
            }
        }
        if(found){
            return students.get(index);
        }
        else {
            return new Student();
        }
    }

    public String createStudent(Student student) {
        students.add(student);
        return "Created...";
    }

    public String updateStudent(Student student) {
        int index=0;
        boolean found=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==student.getRno()){
                index=i;
                found=true;
                break;
            }
        }
        if(found){
            students.set(index,student);
            return "Updated...";
        }
        else {
            return "Match not found";
        }
    }

    public String deleteStdByRno(int rno) {
        int index=0;
        boolean found=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==rno){
                index=i;
                found=true;
                break;
            }
        }
        if(found){
            students.remove(index);
            return "Deleted...";
        }
        else {
            return "Match Not Found";
        }
    }

    public String deleteAll() {
        students.removeAll(students);
        return "Cleared...";
    }
}
