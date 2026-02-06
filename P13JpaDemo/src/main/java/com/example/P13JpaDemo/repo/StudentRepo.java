package com.example.P13JpaDemo.repo;

import com.example.P13JpaDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    List<Student> findByTech(String tech);
    @Query(nativeQuery = true,value = "select * from student where gender=:gender and tech=:tech")
    List<Student> findByGenderAndTech(@Param("gender") String gender,@Param("tech") String tech);
}
