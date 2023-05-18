package package1;

import java.util.Arrays;
import java.util.List;

//5) Given a list of integers, find the total number of elements present in the list using Stream functions?
public class Program5 {
    public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(10,20,30,40,50,60);
		int a=(int) l1.stream().count();
		System.out.println(a);
		
	}

}
