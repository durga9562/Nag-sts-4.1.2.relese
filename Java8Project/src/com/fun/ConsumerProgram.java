package com.fun;

import java.util.function.Consumer;

public class ConsumerProgram {
	static void welcome(String msg) {
		System.out.println("welcome " + msg);
	}

	static void emp(int id) {
		System.out.println("your " + id);
	}

	public static void main(String[] args) {
		Consumer<String> c1 = ConsumerProgram::welcome;
		c1.accept("Ameer");
		Consumer<Integer> c2 = ConsumerProgram::emp;
		c2.accept(489);
	}

}
