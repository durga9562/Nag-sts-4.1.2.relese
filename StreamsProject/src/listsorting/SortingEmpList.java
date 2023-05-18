package listsorting;

import java.util.Comparator;
import java.util.List;

import model.EmpInfo;
import model.Employee;

public class SortingEmpList {
	public static void main(String[] args) {
		EmpInfo info = new EmpInfo();
		List<Employee> list = info.getList();

		System.out.println("Original List");
		list.forEach(x -> System.out.println(x));

		System.out.println("Sort based on employee id  in ascending order");
		list.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(x -> System.out.println(x));

		System.out.println("Sort based on Employee id in decending order");
		list.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).forEach(System.out::println);

		System.out.println("Sort based on employee salary");
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);

		System.out.println("Sort based on Employee salary in descending order");
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

		System.out.println("Sort Based on employee Name as in ascending order");
		list.stream().sorted(Comparator.comparing(Employee::getEname)).forEach(x -> System.out.println(x));
		
		System.out.println("Sort based on Employee Name as in descending order");
		list.stream().sorted(Comparator.comparing(Employee::getEname).reversed()).forEach(System.out::println);

	}

}
