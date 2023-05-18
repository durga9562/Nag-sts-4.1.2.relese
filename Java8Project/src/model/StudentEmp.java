package model;

import java.util.ArrayList;
import java.util.List;

public class StudentEmp {

	List<Student> list = new ArrayList();

	public StudentEmp() {
		list.add(new Student(1, "Ameer", 24, 25000));
		list.add(new Student(19, "zaheera", 21, 15000));
		list.add(new Student(5, "sai", 23, 24000));
		list.add(new Student(2, "rama", 25, 23000));
	}

	public List<Student> getall() {
		return list;

	}

}
