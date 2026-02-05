package com.example.P7FirstCodeInSB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    @Qualifier("pen")
    private Writer writer;

    public void show(){
        System.out.println("In Show Method");
    }
    public void writeExam(){
        writer.write();
    }
}

