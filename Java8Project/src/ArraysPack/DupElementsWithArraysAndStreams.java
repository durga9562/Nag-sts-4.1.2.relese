package ArraysPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DupElementsWithArraysAndStreams {

	public static void main(String[] args) {
		System.out.println("By using Arrays");
		int[] arr = { 1, 6, 8, 9, 8, 8, 6, 3, 1 };

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '*';
				}
			}
			if (count > 1 && arr[i] != '*') {

				System.out.println(arr[i]);
			}
		}

		System.out.println("With Using List");
		List<Integer> l1 = Arrays.asList(1, 6, 8, 9, 8, 8, 6, 3, 1);
		Set<Integer> s1 = new HashSet<Integer>();
		l1.stream().filter(x -> !s1.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

	}

}
