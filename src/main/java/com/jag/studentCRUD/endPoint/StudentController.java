package com.jag.studentCRUD.endPoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jag.studentCRUD.StudentCrudApplication;
import com.jag.studentCRUD.model.Student;
import com.jag.studentCRUD.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class StudentController {

	StudentService studentService;
	
	public StudentController(){
		this.studentService = new StudentService();
	}

	@PostMapping("/student")
	@ResponseBody
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		log.info(student.toString());
		return ResponseEntity.ok(studentService.createStudent(StudentCrudApplication.key++, student));
		
	}
	@PutMapping("/student/update")
	@ResponseBody
	public void updateStudent(@RequestBody Student student){
		studentService.updateStudent(student);
		
	}
	
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") String id) {
		log.info("ID GET : " + id);
		return ResponseEntity.ok(studentService.getStudent(id));
		
	} 

	
	@DeleteMapping("/student/remove/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") String id){
		log.info("ID DELETE : " + id);
		System.out.println("Before delete " + StudentCrudApplication.map);
		return ResponseEntity.ok(studentService.deleteStudent(id));
	}
	
	
	@GetMapping("/student/all")
	@ResponseBody
	public ResponseEntity<List<Student>> getAllStudent(){
		System.out.println("Getall " + StudentCrudApplication.map);
		return ResponseEntity.ok(studentService.getAllStudents());
	}
	

}
