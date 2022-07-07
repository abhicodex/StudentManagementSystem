package com.javaprojects.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
