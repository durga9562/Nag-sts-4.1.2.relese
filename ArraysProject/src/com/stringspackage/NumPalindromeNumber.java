package com.stringspackage;

public class NumPalindromeNumber {
	public static void main(String[] args) {
		int num = 489;
		int rem = 0;
		int rev = 0;
		
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}

}
