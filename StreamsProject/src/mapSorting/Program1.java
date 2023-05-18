package mapSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Program1 {
	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(4, "ameer");
		m1.put(59, "siva");
		m1.put(82, "ram");
		m1.put(83, "zaheera");
		m1.put(82, "peter");

		System.out.println("original List");
		System.out.println(m1);
		System.out.println("Key And Value Pair");
		for (Map.Entry<Integer, String> m2 : m1.entrySet()) {
			System.out.println(m2.getKey() + "-" + m2.getValue());
		}

		System.out.println("Sort by value first method");
		m1.entrySet().stream().sorted(Entry.comparingByValue()).forEach(x -> System.out.println(x));

		System.out.println("Sort by value second method");
		Set<Entry<Integer, String>> s = m1.entrySet();
		List<Entry<Integer, String>> l1 = new ArrayList(s);
		l1.stream().sorted(Map.Entry.comparingByValue()).forEach(x -> System.out.println(x));

		System.out.println("Sort by key first method ----");
		m1=m1.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		//System.out.println(m1);
			m1.entrySet().forEach(x -> System.out.println(x.getKey() + " - "  +x.getValue()));	
		

		System.out.println("Sort by Key second method");
		l1.stream().sorted(Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("Sort by value by  using collections");
		Collections.sort(l1, (x, y) -> x.getValue().compareTo(y.getValue()));
		l1.forEach(x -> System.out.println(x));

		System.out.println("Sort by key by using collections");
		Collections.sort(l1, (x, y) -> x.getKey().compareTo(y.getKey()));
		l1.forEach(x -> System.out.println(x));

	}

}
