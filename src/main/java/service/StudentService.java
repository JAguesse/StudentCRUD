package service;

import org.springframework.stereotype.Service;

import com.jag.studentCRUD.StudentCrudApplication;
import com.sun.corba.se.spi.activation.Repository;

import model.Student;

@Service
public class StudentService {
	
	public Student createStudent(int id, Student student) {
		StudentCrudApplication.map.put(id,student); //(save, va faire un create or update)
		//tweetRepository.insert(tweet); (insert renverra une erreur si l'id existe déjà)
		return new Student();
	}
	
	public Student getStudent(String id) {
		return StudentCrudApplication.map.get(id);
		
	}

	public Student deleteStudent(String id) {
		return StudentCrudApplication.map.remove(id);
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
