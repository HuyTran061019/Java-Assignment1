package com.example.practice04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice04.model.Student;
import com.example.practice04.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(path = "/students", method = RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping(path = "/students", method = RequestMethod.POST)
	public int addStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

}