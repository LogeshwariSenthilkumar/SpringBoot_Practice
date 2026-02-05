package com.example.P7FirstCodeInSB;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    int rno;
    public void show(){
        System.out.println("In Show Method");
    }
}

