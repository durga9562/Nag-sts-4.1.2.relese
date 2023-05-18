package com.fun;

import java.util.function.Predicate;

public class PredicateInterfaceProgram {
	public static void main(String[] args) {
		Predicate<Integer> pr = x -> (x > 89);
		System.out.println(pr.test(215));
	}

}
