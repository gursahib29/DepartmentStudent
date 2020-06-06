package com.example.demo.Model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Department")
public class Department {

	private int departmentId;

	private String departmentName;

	private List<Student> students;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
