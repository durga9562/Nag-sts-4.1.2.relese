package package1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//4) Given the list of integers, find the first element of the list using Stream functions?
public class Program4 {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(101,20,300,10,40,50);
//		int firstNum=l1.stream().findFirst().get();
//		System.out.println(firstNum);
		
		Optional<Integer> firstNum=l1.stream().findFirst();
		System.out.println(firstNum);
	}

}
