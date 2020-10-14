package com.jag.studentCRUD;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jag.studentCRUD.model.Student;

@SpringBootApplication
public class StudentCrudApplication {
	
	public static HashMap<Integer, Student> map;

	public static void main(String[] args) {
		SpringApplication.run(StudentCrudApplication.class, args);
		map = new HashMap<Integer, Student>();
	}

}
 