package com.ojas;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomNumber {
	private int i=10;
	
	public static String generatePassword() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		String pass = null;
		Random random = new Random();
		int length = 6;
		char[] password = new char[length];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));
		for (int i = 4; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
			
		}
		 String copyValueOf = String.copyValueOf(password);
		 System.out.println(copyValueOf);
		return copyValueOf;
	}
	
	
	
	
	public static long getRandomBooking() {
		RandomNumber obj=new RandomNumber();
		System.out.println(obj.i);
		long min = 100000000000L;
		long max = 1000000000000L;
		//System.out.println(max-min+1+min);
		long b = (long) (Math.random() * (max - min + 1) + min);
		System.out.println(b);
		return b;
	}
	public static String getDayName() {
		Format dateFormat = new SimpleDateFormat("EEE");
		String day = dateFormat.format(new Date());
		System.out.println(day);
		return day;
	}
	public static void main(String[] args) {
		//generatePassword();
		getRandomBooking();
	//	getDayName();
	}
}
