package com.ojas;

public class RemoveDupCharsInString {
	public static void main(String[] args) {
		String str = "AmeerBasha";
		char[] ch = str.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;

				}
			}
			if (count == 1) {
				System.out.println(ch[i]);
			}
		}

	}

}
