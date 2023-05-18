package listsorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProgram1 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(85);
		l1.add(5);
		l1.add(91);
		l1.add(35);
		System.out.println("Original List");
		System.out.println(l1);

		System.out.println("Iterator Method");
		Iterator<Integer> i1 = l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		System.out.println("List Iterator method with hasNext");
		ListIterator<Integer> i2 = l1.listIterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("List Iterator method with hasPrevious");
		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}

		System.out.println("Sort Elements in Ascending order");
		l1.stream().sorted().forEach(System.out::println);

		System.out.println("Sort Elements in descending order");
		l1.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));

		System.out.println("Count of Elements in list");
		long listCount = l1.stream().count();
		System.out.println(listCount);

		System.out.println("Max Element in list");
		int maxEle = l1.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
		System.out.println(maxEle);

		System.out.println("Min Element in List");
		int minEle = l1.stream().min(Comparator.comparingInt(Integer::valueOf)).get();
		System.out.println(minEle);

	}

}
