package com.stringspackage;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String ");
		String str1 = scanner.nextLine();
		String str2 = "";

		for (int i = str1.length() - 1; i >=0; i--) {
			str2 += str1.charAt(i);
		}
		System.out.println(str2);
		scanner.close();

	}

}
