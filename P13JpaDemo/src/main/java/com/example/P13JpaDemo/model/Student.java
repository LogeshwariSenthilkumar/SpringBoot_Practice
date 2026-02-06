package com.example.P13JpaDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    private int rno;
    private String name;
    private String tech;
    private String gender;
}
