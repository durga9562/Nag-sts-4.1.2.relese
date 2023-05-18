package com.ojas;

public class GetOnlyConstant {
	public static void main(String[] args) {

		String str = "AmeeeerBasha";
		char[] ch = str.toLowerCase().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '&';
				}
			}
			if ( ch[i] != '&') {
				System.out.println(ch[i]);
			}
		}
	}

}
