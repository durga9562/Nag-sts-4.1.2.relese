package package1;
//2) Given a list of integers, find out all the numbers starting with 1 using Stream functions?
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Program2 {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(12,96,17,19,19,99,199);
		
		List<String> l2=l1.stream().map(x-> x +  "").filter(x-> x.startsWith("1")).distinct().collect(Collectors.toList());
		System.out.println(l2);
		
//		List<Integer> l3=l1.stream().filter(x-> x/10==1||x/100==1||x/1000==1).distinct().collect(Collectors.toList());
//		System.out.println(l3);
	}

}
