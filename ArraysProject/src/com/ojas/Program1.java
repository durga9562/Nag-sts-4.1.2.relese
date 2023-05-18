package com.ojas;

public class Program1 {
	public static void main(String[] args) {
		String str1 = "Swwwathi";
		String str2 = "Amrwwiitss";
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			int count = 0;
			for (int j = 0; j < ch2.length; j++) {
				if (ch1[i] == ch2[j]) {
					count++;
					ch2[j] = '&';
				}
			}
			if (count > 0 && ch1[i] != '&') {
				System.out.println(ch1[i] + " = " + count);
			}
		}

	}

}
