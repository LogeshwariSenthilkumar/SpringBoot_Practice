package com.example.P7FirstCodeInSB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
    //Field Injection::
//    @Autowired
//    private Pen pen;
    private Pen pen;
    //Setter Injection::
//    @Autowired
//    public void setPen(Pen pen) {
//        this.pen = pen;
//    }

    @Autowired
    public Student(Pen pen) {
        this.pen = pen;
    }

    public void show(){
        System.out.println("In Show Method");
    }
    public void writeExam(){
        pen.write();
    }
}

