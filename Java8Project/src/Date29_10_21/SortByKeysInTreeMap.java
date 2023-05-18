package Date29_10_21;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//. Write a Java program to sort keys in Tree Map by using comparator.
public class SortByKeysInTreeMap {
	public static void main(String[] args) {

		Map<Integer, String> m1 = new TreeMap<Integer, String>();
		m1.put(61, "Ameer");
		m1.put(36, "basha");
		m1.put(59, "sai");
		m1.put(25, "sundar");

		System.out.println("Sort by Key");
		m1.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("Sort by value");
		m1.entrySet().stream().sorted(Entry.comparingByValue()).forEach(x -> System.out.println(x));

	}

}
