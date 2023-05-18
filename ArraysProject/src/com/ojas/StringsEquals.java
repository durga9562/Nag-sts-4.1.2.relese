package com.ojas;

public class StringsEquals {
	public static void main(String[] args) {

		String s1 = "Ameer";
		String s2 = "Ameer";

		String s3 = new String("Ameer");
		String s4 = new String("Ameer");


//
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));

		
		
		

//		System.out.println(s3 == s4);
//
//		System.out.println(s3.equals(s4));
		
		
		
		

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}

}
