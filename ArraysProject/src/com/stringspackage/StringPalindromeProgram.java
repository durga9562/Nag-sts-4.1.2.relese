package com.stringspackage;

public class StringPalindromeProgram {
	public static void main(String[] args) {
		String str1 = "madam";
		String str2 = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 += str1.charAt(i);
		}
		if (str2.equalsIgnoreCase(str1)) {
			System.out.println("This String is Palindrome");
		} else {
			System.out.println("Not a Plaindrome");
		}
		
		
		
	}

}
