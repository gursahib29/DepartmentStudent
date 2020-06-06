package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@RestController
public class StudentController {

	//@Autowired
	//MongoTemplate mongoTemplate;
	
	@Autowired
	StudentRepository studentRepository;

	@RequestMapping(value = "/student/save", method = RequestMethod.POST)
	public boolean saveStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return true;
	}
	
	@RequestMapping(value = "/student/findAll", method = RequestMethod.GET)
	public List<Student> findAll(){
		List<Student> students = studentRepository.findAll();
		return students;
	}
}
