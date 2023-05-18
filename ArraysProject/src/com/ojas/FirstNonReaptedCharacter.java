package com.ojas;

public class FirstNonReaptedCharacter {
	public static void main(String[] args) {
		String str="AmeerBasha";
		char[] ch = str.toUpperCase().toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(ch[i]) == str.lastIndexOf(ch[i])) {
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
