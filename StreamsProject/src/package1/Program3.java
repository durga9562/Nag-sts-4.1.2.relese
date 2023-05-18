package package1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//3) How to find duplicate elements in a given integers list in java using Stream functions?
public class Program3 {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(10,10,20,74,74,20,89,89,89,89,66,20);
		Set<Integer> s1=new TreeSet<>();
		List<Integer> l3=l1.stream().filter(x-> !s1.add(x)).distinct().collect(Collectors.toList());
		System.out.println(l3);
	}

}
