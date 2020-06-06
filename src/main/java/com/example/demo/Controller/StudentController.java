package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;

@RestController
public class StudentController {

	@Autowired
	MongoTemplate mongoTemplate;

	@RequestMapping(value = "/student/save", method = RequestMethod.POST)
	public boolean saveStudent(@RequestBody Student student) {
		mongoTemplate.save(student);
		return true;
	}
}
