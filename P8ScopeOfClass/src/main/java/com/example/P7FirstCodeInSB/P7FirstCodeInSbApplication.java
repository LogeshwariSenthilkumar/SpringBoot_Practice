package com.example.P7FirstCodeInSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class P7FirstCodeInSbApplication {

	public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(P7FirstCodeInSbApplication.class, args);
        Student student=context.getBean(Student.class);
        student.rno=10;
        System.out.println(student.rno);
        Student student1=context.getBean(Student.class);
        System.out.println(student1.rno);
	}

}
