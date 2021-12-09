package in.aswinit.service;

import org.springframework.stereotype.Service;

import in.aswinit.binding.Student;
@Service
public class StudentService {
	public Student getStudentData()
	{
		Student student=new Student(101,"aaa","aaa@gmail.com");
		return student;
	}
}
