package com.example.P15CourseRegistrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CourseReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emailId;
    private String courseName;

    public CourseReg(String name, String courseName, String emailId) {
        this.name = name;
        this.courseName = courseName;
        this.emailId = emailId;
    }

    public CourseReg() {
    }
}
