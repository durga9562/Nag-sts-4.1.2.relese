package stusorting;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import model.Student;
import model.StudentEmp;

public class StudentSorting {
	public static void main(String[] args) {
		StudentEmp emp = new StudentEmp();

		List<Student> l1 = emp.getall();

		System.out.println("original emp list");
		System.out.println(l1);

		System.out.println("stu by using iterator");
		Iterator<Student> i1 = l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println("stu by using ListIteratot with hasnext");
		ListIterator<Student> i2 = l1.listIterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("stu by using ListIterator with hasprevious");
		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}

		System.out.println("Sort stu by using id in ascending");
		l1.stream().sorted(Comparator.comparingInt(Student::getId)).forEach(System.out::println);

		System.out.println("Sort stu by using id in descending");
		l1.stream().sorted(Comparator.comparingInt(Student::getId).reversed()).forEach(x -> System.out.println(x));

		System.out.println("get stu if id greater than 10");
		List<Student> list = l1.stream().filter(x -> x.getId() > 10).collect(Collectors.toList());
		System.out.println(list);

		System.out.println("sort based on stu age in ascending");
		l1.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);

		System.out.println("Sort based on stu age in descending order");
		l1.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).forEach(System.out::println);

		System.out.println("get only above 23 age student");
		List<Student> agebased = l1.stream().filter(x -> x.getAge() > 23).collect(Collectors.toList());
		System.out.println(agebased);

		System.out.println("add 1+ year to stu");
		List<Integer> agemap = l1.stream().filter(x -> x.getAge() > 21).map(x -> x.getAge() + 1)
				.collect(Collectors.toList());
		System.out.println(agemap);

		System.out.println("Sort based on salary in ascending above 23000");
		List<Student> stuSal = l1.stream().sorted(Comparator.comparingDouble(Student::getSalary))
				.filter(x -> x.getSalary() > 23000).collect(Collectors.toList());
		System.out.println(stuSal);

		System.out.println("sort based on salary in descending order ");
		l1.stream().sorted(Comparator.comparingDouble(Student::getSalary).reversed()).forEach(System.out::println);

		System.out.println("Sort based on name");
		l1.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);

		System.out.println("Sort based on name in reverse order");
		l1.stream().sorted(Comparator.comparing(Student::getName).reversed()).forEach(System.out::println);

		System.out.println("get only whose name starts with a");
		l1.stream().filter(x -> x.getName().startsWith("z")).forEach(System.out::println);
		System.out.println("get only whose name ends with z");
		l1.stream().filter(x -> x.getName().endsWith("a")).distinct().forEach(System.out::println);
		System.out.println("to upper case");
		List<String> out=l1.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(out);

	}

}
