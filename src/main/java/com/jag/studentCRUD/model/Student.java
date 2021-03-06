package com.jag.studentCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//Create both
@Builder
public class Student {
	
	public String id;  
	public String name; 
	public String surname; 
	public String email; 
	public Integer age; 
	public String group; 
	public String sex;
	public Boolean retake;
	
	
	
	public void updateId(int id) {
		this.id=String.valueOf(id);
	}

	public Student(String name, String surname, String email, Integer age, String group, String sex, Boolean retake) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.age = age;
		this.group = group;
		this.sex = sex;
		this.retake = retake;
	}
	
}
