package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    //Field Injection:
//    @Autowired
//    @Qualifier("pen")
//    private Writer writer;
    private Writer writer;
    //Setter Injection:
//    @Autowired
//    @Qualifier("pencil")
//    public void setWriter(Writer writer) {
//        this.writer = writer;
//    }
   @Autowired
    public Student(@Qualifier("pen") Writer writer) {
        this.writer = writer;
    }

    public void show(){
        System.out.println("In Show Method");
    }
    public void writeExam(){
        writer.write();
    }
}
