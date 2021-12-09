package in.aswinit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aswinit.binding.Student;
import in.aswinit.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@GetMapping(value={"/student"},produces={"application/json","application/xml"})
	public ResponseEntity<Student> getStudentData()
	{
		Student student=studentService.getStudentData();
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
}
