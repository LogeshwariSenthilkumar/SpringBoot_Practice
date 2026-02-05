package org.example;

public class Student {
    private Writer writer;

    public Student(Writer writer) {
        this.writer = writer;
    }

    public void show(){
        System.out.println("In Show Method");
    }
    public void writeExam(){
        writer.write();
    }
}
