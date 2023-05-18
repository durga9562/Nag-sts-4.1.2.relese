package com.ojas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
public Student getstudentDetails() {
	return new Student("Nagaraju", "Madikanti");
	
}
	@GetMapping("/stu")
	public List<Student> getStudents(){
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Arjun", "Reddy"));
		list.add(new Student("Bhargav", "xyz"));
		list.add(new Student("Karun", "rainga"));
		list.add(new Student("Sravan", "puli"));
		
		return list;
		
	}
}
