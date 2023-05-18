package com.ojas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.model.Student;
import com.ojas.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		List<Student> stu=new ArrayList<Student>();
		studentRepository.findAll().forEach(s->stu.add(s));
		return stu;
		}
	public Student getStudentById(int id) {
		
		return studentRepository.findById(id).get();
		
	}
	public Student saveOrupdate(Student student) {
		return studentRepository.save(student);
	}
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
	public void update(Student stu, int id) {
		studentRepository.save(stu);
		
	}
	
	
}
