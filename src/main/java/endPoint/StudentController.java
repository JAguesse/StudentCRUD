package endPoint;

import java.net.URI;
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

import lombok.extern.slf4j.Slf4j;
import model.Student;
import service.StudentService;

@RestController
@Slf4j
public class StudentController {

	StudentService studentService;

	@PostMapping("/student")
	@ResponseBody
	public void createTweet(@RequestBody Student student) {
		log.info(student.toString());
		ArrayList<Integer> keyTab = new ArrayList<Integer>(StudentCrudApplication.map.keySet());
		studentService.createStudent(keyTab.get(keyTab.size()-1)+ 1, student);
		
	}
	@PutMapping("/student/update")
	@ResponseBody
	public void updateStudent(@RequestBody Student student){
		studentService.updateStudent(student);
		
	}
	
	@GetMapping("/student/add/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable("id") String id) {
		log.info("ID GET : " + id);
		return ResponseEntity.ok(studentService.getStudent(id));
		
	}
	
	@DeleteMapping("/student/remove/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") String id){
		log.info("ID DELETE : " + id);
		return ResponseEntity.ok(studentService.deleteStudent(id));
	}
	

}
