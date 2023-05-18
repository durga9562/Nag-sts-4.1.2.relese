package model;

import java.util.ArrayList;
import java.util.List;

public class EmpInfo {

	List<Employee> l1 = new ArrayList<Employee>();

	public EmpInfo() {
		l1.add(new Employee(33, "Ameer", "9182076496", 25000));
		l1.add(new Employee(42, "anil", "9982076496", 24000));
		l1.add(new Employee(31, "shyam", "7182076496", 22000));
		l1.add(new Employee(71, "peter", "8182076496", 26000));
	}

	public List<Employee> getList() {
		return l1;

	}

}
