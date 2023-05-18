package com.ojas;

import java.util.HashMap;
import java.util.Map;

public class SequenceOfChar {
	public static void main(String[] args) {
		String str = "AmeerBasha";
		char[] ch = str.toLowerCase().toCharArray();

		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		for (char c : ch) {

			m1.put(c, m1.containsKey(c) ? m1.get(c) + 1 : 1);
		}
		m1.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

	}

}
