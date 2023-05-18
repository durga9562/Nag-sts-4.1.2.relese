package Date29_10_21;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//2. Write a Java program to get a reverse order view of the keys contained in a given map.
public class ReverseOrderByKey {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new LinkedHashMap<Integer, String>();
		m1.put(5262, "Sharuk");
		m1.put(99929, "Amir");
		m1.put(7456, "Salman");
		m1.put(3747, "dulquar");



		System.out.println(m1);

		System.out.println("comparing by reverse by  key  method -1");
		m1.entrySet().stream().sorted((Collections.reverseOrder(Entry.comparingByKey()))).forEach(System.out::println);

		System.out.println("Comparing by reverse by key method -2");
		m1.entrySet().stream().sorted((Entry.comparingByKey(Comparator.reverseOrder()))).forEach(System.out::println);

		System.out.println("Comparing by Value in reverse method -1");
		m1.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(x -> System.out.println(x));

		System.out.println("Comparing by value in reverse method -2");
		m1.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue())).forEach(System.out::println);

		System.out.println("Keys In Sorted Order");
		m1.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("values in Sorted order");
		m1.entrySet().stream().sorted(Entry.comparingByValue()).forEach(x -> System.out.println(x));
	}

}
