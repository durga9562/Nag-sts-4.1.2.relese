package com.ojas;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
	public static void main(String[] args) {
		String str = "Ameer Basha";
		char[] ch = str.toLowerCase().toCharArray();

		Map<Character, Integer> h1 = new HashMap<>();
		for (Character i : ch) {
			if (i == ' ') {
			} else {
				h1.put(i, h1.containsKey(i) ? h1.get(i) + 1 : 1);
			}
		}

		for (Map.Entry<Character, Integer> l : h1.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}
		System.out.println(h1);
	}

}
