package listsorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingList {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(5);
		l1.add(64);
		l1.add(42);
		l1.add(22);
		System.out.println("Before Sorting");
		l1.forEach(x->System.out.println(x));
		
		System.out.println("After Sorting");
		l1.stream().sorted().forEach(x->System.out.println(x));
		
		System.out.println("sorting in reverse order");
		l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
