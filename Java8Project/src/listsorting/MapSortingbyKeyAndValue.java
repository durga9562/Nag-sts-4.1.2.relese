package listsorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class MapSortingbyKeyAndValue {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(37, "Ameer");
		m1.put(89, "khan");
		m1.put(22, "raju");
		m1.put(61, "zaheera");

		System.out.println("Original map");
		System.out.println(m1);

		System.out.println("key and value pair");
		for (Map.Entry<Integer, String> e1 : m1.entrySet()) {
			System.out.println(e1.getKey() + " - " + e1.getValue());
		}
		System.out.println("Sorted by key");
		m1.entrySet().stream().sorted(Entry.comparingByKey()).forEach(x -> System.out.println(x));

		System.out.println("Sorted by key in descending");
		m1.entrySet().stream().sorted(Entry.comparingByKey()).forEachOrdered(System.out::println);

		System.out.println("Sort by Value");
		m1.entrySet().stream().sorted(Entry.comparingByValue()).forEachOrdered(System.out::println);

		System.out.println("sort by value in decending ");
		m1.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("Sort key by using set and list");
		Set<Entry<Integer, String>> s1 = m1.entrySet();
		List<Entry<Integer, String>> l1 = new ArrayList<Map.Entry<Integer, String>>(s1);

		l1.stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("Sort Value by using set and list");

		l1.stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("Store sorted elements in same hasmap reference by value");
		m1=m1.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		m1.entrySet().forEach(x -> System.out.println(x.getKey() + " - "  +x.getValue()));
		
		
		System.out.println("Store sorted elements in same hasmap reference by key");
		m1=m1.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		m1.entrySet().forEach(x -> System.out.println(x.getKey() + " - "  +x.getValue()));

	}

}
