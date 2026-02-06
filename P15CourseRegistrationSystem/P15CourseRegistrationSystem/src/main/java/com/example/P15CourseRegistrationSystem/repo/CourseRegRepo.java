package com.example.P15CourseRegistrationSystem.repo;

import com.example.P15CourseRegistrationSystem.model.CourseReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegRepo extends JpaRepository<CourseReg,Integer> {
}
