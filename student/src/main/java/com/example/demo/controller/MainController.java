package com.example.demo.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class MainController {
	
	@Autowired
	private StudentService studentservice;
	
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/")
	public String index() {
		return "student marks";
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/test")
	public String test() {
		return "testt passed";
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/student")
	public Student add(@RequestBody Student student) {
		return studentservice.addStudent(student);
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/student")
	public List<Student> getStudent(){
		return studentservice.getAllStudent();
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/student/{id}")
	public Student update(@PathVariable Long id, Student student) {
		return studentservice.updateEmployeeById(id, student);
	}
	@GetMapping("/student/{id}")
	public Optional<Student> getStudentbyIdForAdmin(@PathVariable Long id) {
		return studentservice.getStudentById(id);
		
	}
	
	
	
	@GetMapping("/result")
	public Optional<Student> getSttudentId(org.springframework.security.core.Authentication auth) {
		String id=auth.getName();
		return studentservice.getStudentById((long) Integer.parseInt(id));
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/student/{id}")
	public String delete(@PathVariable Long id) {
		return studentservice.deleteStudentById(id);
	}
	
	
	
}

