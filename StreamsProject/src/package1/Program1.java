package package1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//1) Given a list of integers, find out all the even numbers exist in the list using Stream functions?
public class Program1 {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(10,25,30,40,50,89,72,63);
		List<Integer> l2=l1.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
