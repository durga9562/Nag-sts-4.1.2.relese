package maxmin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.EmpInfo;
import model.Employee;

public class Program1 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(74);
		l1.add(48);
		l1.add(63);
		l1.add(6);
		System.out.println(l1);
		l1.forEach(x -> System.out.println(x));

		System.out.println("maximum Element in your list");
		int maxEle = l1.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
		System.out.println(maxEle);

		System.out.println("Minmum Element in your list");
		int minEle = l1.stream().min(Comparator.comparingInt(Integer::valueOf)).get();
		System.out.println(minEle);
		
		
		System.out.println("Number of elements in a list");
		long no=l1.stream().count();
		System.out.println(no);
		
		
		EmpInfo emp=new EmpInfo();
		List<Employee> e1=emp.getList();
		System.out.println(e1);
		
		System.out.println("Max Employee id");
		Employee id= e1.stream().max(Comparator.comparingInt(Employee::getId)).get();
		System.out.println(id);
		
		System.out.println("Min Employee id");
		Employee eid=e1.stream().min(Comparator.comparingInt(Employee::getId)).get();
		System.out.println(eid);
		
		System.out.println("Number of Employee ");
		long ct=e1.stream().count();
		System.out.println(ct);
		
		
		System.out.println("get More salary");
		e1.stream().filter(x ->x.getSalary()>24000).forEach(x->System.out.println(x));
		
		
		

	}

}
