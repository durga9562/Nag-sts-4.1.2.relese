package package1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q9) Given a list of integers, sort all the values present in it using Stream functions?
public class Program9 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10, 20, 50,3, 74, 6, 19);
		List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);

	}

}
