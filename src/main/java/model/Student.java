package model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tool.Group;

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
	public Group group; 
	public String sex;
	public Boolean retake;
	
}
