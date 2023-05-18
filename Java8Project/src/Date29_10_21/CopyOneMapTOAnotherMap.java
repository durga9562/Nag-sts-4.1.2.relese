package Date29_10_21;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


//1.write a Java program to copy all of the mappings from the specified map to another map.
public class CopyOneMapTOAnotherMap {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "Sharuk");
		m1.put(89, "Amir");
		m1.put(56, "Salman");
		m1.put(37, "dulquar");

		System.out.println(m1);

		Map<Integer, String> m2 = new LinkedHashMap<>(m1);
		m2.entrySet().stream().forEach(System.out::println);

	}

}
