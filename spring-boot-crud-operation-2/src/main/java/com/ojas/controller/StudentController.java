package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Student;
import com.ojas.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@GetMapping("/student")
	private List<Student> getAllStudents(){
		return studentService.getAllStudents();
		
	}
	@GetMapping("/student/{id}") 
	private Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
		
	}  
	@PostMapping("/data")  
	private Student saveBook(@RequestBody Student stu){
		
		Student s=studentService.saveOrupdate(stu);
		return s;
	}
	@DeleteMapping("/student/{id}")  
	public void delete(@PathVariable("id") int id) {
		studentService.delete(id);
	}
	@PutMapping("/student")  
	private Student update(@RequestBody Student stu)   
	{
		return studentService.saveOrupdate(stu); 
	
	}
	

}
