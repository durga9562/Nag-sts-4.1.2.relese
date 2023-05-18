package package1;

import java.util.Arrays;
import java.util.List;

//6) Given a list of integers, find the maximum value element present in it using Stream functions?
public class Program6 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10, 25, 74, 96, 66, 108);
		int maxEle = l1.stream().max(Integer::compare).get();
		System.out.println(maxEle);
	}

}
