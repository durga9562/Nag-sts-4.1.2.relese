package package1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//Given a list of integers, sort all the values present in it in descending order using Stream functions?
public class Program8 {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(52,89,10,85,63,73,94);
		List<Integer> l2=l1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(l2);
	}

}
