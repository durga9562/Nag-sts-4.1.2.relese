package com.fun;

import java.util.function.Predicate;

public class Pre2 {

	static boolean checkvoter(int age) {
		if (age > 18) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> pre = Pre2::checkvoter;
		System.out.println((pre.test(94)));

	}

}
