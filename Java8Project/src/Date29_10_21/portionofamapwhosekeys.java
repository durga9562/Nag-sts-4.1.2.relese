package Date29_10_21;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Write a Java program to get the portion of a map whose keys are strictly less than a given key.
public class portionofamapwhosekeys {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(4, "sai");
		m1.put(85, "ram");
		m1.put(91, "peter");
		m1.put(52, "charan");

		System.out.println(m1);

		System.out.println("the portion of a map whose keys are strictly less than a given key");
		m1.entrySet().stream().filter(x -> x.getKey() < 70).forEach(System.out::println);

		System.out.println("the portion of a map whose keys are strictly greater than a given key");
		m1.entrySet().stream().filter(x -> x.getKey() > 84).forEach(System.out::println);

		System.out.println("Get Only Given Key  Data Info");
		m1.entrySet().stream().filter(x -> x.getKey().equals(52)).forEach(x -> System.out.println(x));

		System.out.println("Get Only given value info");
		m1.entrySet().stream().filter(x -> x.getValue().equalsIgnoreCase("Peter")).forEach(x -> System.out.println(x));

		long m = m1.entrySet().stream().count();
		System.out.println(m);

	}

}
