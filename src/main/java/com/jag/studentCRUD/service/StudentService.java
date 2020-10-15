package com.jag.studentCRUD.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jag.studentCRUD.StudentCrudApplication;
import com.jag.studentCRUD.model.Student;

@Service
public class StudentService {
	
	public Student createStudent(int id, Student student) {
		StudentCrudApplication.map.put(id,student); //(save, va faire un create or update)
		student.updateId(id);
		//tweetRepository.insert(tweet); (insert renverra une erreur si l'id existe déjà)
		System.out.println(student.toString());
		return StudentCrudApplication.map.get(id);
	}
	
	public Student getStudent(String id) {
		return StudentCrudApplication.map.get(id);
		
	}

	public Student deleteStudent(String id) {
		return StudentCrudApplication.map.remove(id);
	}
	
	public List<Student> getAllStudents(){
		ArrayList<Student> students = new ArrayList<Student>();
		for(Integer key : StudentCrudApplication.map.keySet()) {
			students.add(StudentCrudApplication.map.get(key));
		}
		return students;
	}

	public void updateStudent(Student student) {
		StudentCrudApplication.map.get(Integer.parseInt(student.getId())).setName(student.name);
		StudentCrudApplication.map.get(Integer.parseInt(student.getId())).setSurname(student.surname);
		StudentCrudApplication.map.get(Integer.parseInt(student.getId())).setEmail(student.email);
		StudentCrudApplication.map.get(Integer.parseInt(student.getId())).setSex(student.sex);
		StudentCrudApplication.map.get(Integer.parseInt(student.getId())).setAge(student.age);
		StudentCrudApplication.map.get(Integer.parseInt(student.getId())).setGroup(student.group);
		StudentCrudApplication.map.get(Integer.parseInt(student.getId())).setRetake(student.retake);
	}

}
