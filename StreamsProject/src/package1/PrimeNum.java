package package1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNum {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,7,11,23,4,96);
		List<Integer> l2=l1.stream().filter(PrimeNum::isPrime).collect(Collectors.toList());
		System.out.println(l2);

	}
	public static boolean isPrime(int num) {
		boolean b=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				b=false;
				break;
			}
		}
		return b;
	}
	
}
