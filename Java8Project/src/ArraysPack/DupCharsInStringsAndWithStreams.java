package ArraysPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupCharsInStringsAndWithStreams {
	public static void main(String[] args) {
		String name = "ameerbasha";
		System.out.println("Duplicate Characters in a String " + name);
		char[] ch = name.toUpperCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '%';
				}
			}
			if (count > 1 && ch[i] != '%') {
				System.out.println(ch[i]);
			}
		}
		System.out.println("Duplicate Characters in string by using streams");
		List<Character> l1 = Arrays.asList('a', 'm', 'a', 'e', 'E', 'r', 'M');
		Set<Character> h1 = new HashSet<>();
		l1.stream().filter(x -> !h1.add(x.toUpperCase(x))).collect(Collectors.toSet()).forEach(System.out::println);

	}

}
