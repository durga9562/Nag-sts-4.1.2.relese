package ArraysPack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateStringWithArraysAndStreams {
	public static void main(String[] args) {
		System.out.println("Program with Duplicate String with arrays");
		String[] str = { "Ameer", "ameer", "KHAN", "basha", "khan" };
		for (int i = 0; i < str.length; i++) {
			int count = 1;

			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					count++;
					str[j] = "*";
				}
			}
			if (count > 1 && str[i] != "*") {
				System.out.println(str[i]);
			}
		}
		System.out.println("Program with duplicate Srings with Streams");
		List<String> l1 = Arrays.asList("Ameer", "ameer", "basha", "khan", "KHAN");
		Set<String> s1 = new HashSet<String>();
		l1.stream().filter(x -> !s1.add(x.toUpperCase())).collect(Collectors.toSet()).forEach(System.out::println);

	}

}
