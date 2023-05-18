package com.ojas;

import java.util.ArrayList;
import java.util.List;

public class EmpInfo {

	List<Employee> emp = new ArrayList();

	public EmpInfo() {

		emp.add(new Employee(4, "Ameer", 25000));
		emp.add(new Employee(5, "basha", 22000));
		emp.add(new Employee(2, "zaheer", 27000));
		emp.add(new Employee(3, "sam", 21000));

	}

	public List<Employee> getAllEmp() {
		return emp;
	}

}
