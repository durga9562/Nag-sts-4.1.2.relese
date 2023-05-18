package com.ojas;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSorting {
	public static void main(String[] args) {

		EmpInfo info = new EmpInfo();
		List<Employee> l1 = info.getAllEmp();

//		System.out.println("//////////////////Using List on Id///////////////////////");
//
//		System.out.println("Sort Employee Based on Employee ID-------");
//		l1.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(System.out::println);
//
//		System.out.println("Sort Employee In Descending order Based on ID------");
//		l1.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).forEach(System.out::println);
//
//		System.out.println("get Employee Only whose id greter than 25-----");
//		l1.stream().filter(x -> x.getId() > 500).forEach(System.out::println);
//
//		System.out.println("Summing of the Employee ids whose ids are greater than 500");
//		int sum = l1.stream().filter(x -> x.getId() > 500).collect(Collectors.summingInt(Employee::getId));
//		System.out.println(sum);
//
//		System.out.println("Count of Elements");
//		long countEle = l1.stream().count();
//		System.out.println(countEle);
//
//		System.out.println("Max Id In Employee ids");
//		Employee maxID = l1.stream().max(Comparator.comparingInt(Employee::getId)).get();
//		System.out.println(maxID);
//
//		System.out.println("Find first Ele After Sorting");
//		Employee firstEmp = l1.stream().sorted(Comparator.comparingInt(Employee::getId)).findFirst().get();
//		System.out.println(firstEmp);
//
//		System.out.println("Find first  Element in reverse order");
//		Employee secondMaxEmployee = l1.stream().sorted(Comparator.comparingInt(Employee::getId).reversed())
//				.findFirst().get();
//		System.out.println(secondMaxEmployee);
//		
//		int out=l1.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).skip(1).collect(Collectors.summingInt(Employee::getId));
//		System.out.println(out);

//		System.out.println("////////////////////////on Salary Using List////////////////////////////////////");
//		System.out.println("Get Employee Salary In Ascending order ");
//		l1.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
//
//		System.out.println("Get Employee Salary In Descending order");
//		l1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
//
//		System.out.println("Get Highest salary ");
//		Employee highSal = l1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst()
//				.get();
//		System.out.println(highSal);
//
//		System.out.println("Second Highest Salary ");
//		Employee secondHighSal = l1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
//				.findFirst().get();
//		System.out.println(secondHighSal);
//
//		System.out.println("Sum of Salary Whose salary is greater than 21000");
//		Double sumOfSal = l1.stream().filter(x -> x.getSalary() > 21000)
//				.collect(Collectors.summingDouble(Employee::getSalary));
//		System.out.println(sumOfSal);
//
//		System.out.println("Sum of salary except  top first salary");
//		Double sumofRem = l1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
//				.collect(Collectors.summingDouble(Employee::getSalary));
//		System.out.println(sumofRem);
//
		System.out.println(
				"---------------------------------HashMap----------------------------------------------------");

		Map<Integer, Employee> m1 = new HashMap<>();
		m1.put(1, new Employee(85, "santu", 25000));
		m1.put(5, new Employee(14, "samantha", 11000));
		m1.put(8, new Employee(74, "raghu", 17000));
		m1.put(91, new Employee(82, "ravi", 21000));

		System.out.println("Sort Employee Salary In ascending");
		m1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Employee::getSalary)))
				.forEach(System.out::println);

		System.out.println("Sort Employee Salary In descending");
		m1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Employee::getSalary).reversed()))
				.forEach(System.out::println);

		System.out.println(" max Salary From Employees");
		java.util.Map.Entry<Integer, Employee> maxSal = m1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Employee::getSalary).reversed()))
				.findFirst().get();
		System.out.println(maxSal);

		System.out.println("Second max Salary");
		java.util.Map.Entry<Integer, Employee> secondMax = m1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Employee::getSalary).reversed())).skip(1)
				.findFirst().get();

		System.out.println(secondMax);

		System.out.println("Sum of salarys");

		 double sum = m1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Employee::getSalary).reversed())).skip(1)
				.mapToDouble(x->x.getValue().getSalary()).sum();
		System.out.println(sum);
		
	
	}

}
