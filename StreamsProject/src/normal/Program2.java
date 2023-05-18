package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@FunctionalInterface
interface Emp{
	void wish(String name);
}

class Employee{
	private String name;
	private int age;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

public class Program2 {
	
	public static void hello(String name) {
		System.out.println("Welcome " + name);
	}
	
	Emp e = new Emp() {

		@Override
		public void wish(String name) {
			System.out.println("Hiiiiiiiiiii");
			
		}
		
	};
	
	public static void main(String[] args) {
//		List<Employee> li = new ArrayList<>();
//		li.add(new Employee("Ameer", 24));
//		li.add(new Employee("Anil", 25));
//		
//	//	li.forEach(x -> System.out.println( x.getName()));
//		
//	//	Emp e = (name) -> System.out.println("Hello " + name);
//	
////		Emp e = Program2 :: hello;
////		li.forEach(x -> e.wish(x.getName()));
//		
//		Program2 p = new Program2();
//		p.e.wish(" ");
//		
//		
//		hello(" ");
		
		
//		int[] arr = {2,1,3,5,2,1,5,7,6};
//		
//		List<Integer> li = Arrays.asList(2,1,3,5,8,9,5,7,6);
		
	//	li = li.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	//	li = li.stream().sorted().collect(Collectors.toList());
	//	System.out.println(li.get(0) + li.get(3));
		
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//	System.out.println(arr[0] + arr[3]);
		
//		String s = "ameer";
//		
//		Map<Character, Integer> map = new HashMap();
//		
//		for(char ar : s.toCharArray()) {
//			
//			map.put(ar, map.containsKey(ar) ? map.get(ar) + 1 : 1);
//		}
//		
//		map.entrySet().forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));
		
//		Set<Integer> set = new HashSet<>();
//		List<Integer> li = Arrays.asList(2,5,2,5,1,6,7);
//		//li.stream().filter(x -> !set.add(x)).forEach(System.out::println);
//		System.out.println("-----------------");
//		li.stream().distinct().forEach(System.out::println);
//	
//		System.out.println("--------------------");
//		Map<Integer, Integer> map = new HashMap();
//		
//		for(int ar : li) {
//			
//			map.put(ar, map.containsKey(ar) ? map.get(ar) + 1 : 1);
//		}
//		
//		map.entrySet().stream().filter(x -> x.getValue() == 1).forEach(x -> System.out.println(x.getKey()));
	
		String str = "Lakshminarayana";
		List<String> li = new ArrayList<>();
		
		String res = "";
		int temp = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(res.contains(str.charAt(i) + "") || i == str.length() - 1) {
				li.add(res);
				res = "";
				i = temp;
				temp++;
			}
			else {
				res += str.charAt(i);
			}
		}
		
		li.forEach(System.out::println);
		System.out.println("--------------------------");
		
		int maxi = 0;
		for(String s : li) {
			if(s.length() > maxi) {
				maxi = s.length();
			}
		}
		
		for(String s : li) {
			if(s.length() == maxi) {
				System.out.println(s);
			}
		}
	}
	
		
	
	

}
