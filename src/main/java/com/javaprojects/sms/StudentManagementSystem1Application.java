package com.javaprojects.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaprojects.sms.entity.Student;
import com.javaprojects.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystem1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	
    @Override
	public void run(String...strings) throws Exception{
//		Student student1 = new Student("aff","afea","@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("aff2","afea2","@gmail.com2");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("aff3","afea3","@gmail.com3");
//		studentRepository.save(student3);
	}

}
