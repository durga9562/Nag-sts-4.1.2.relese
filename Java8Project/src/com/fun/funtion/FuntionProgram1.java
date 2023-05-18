package com.fun.funtion;

import java.util.function.Function;

public class FuntionProgram1 {

	static String show(String msg) {
		return "Hello" + msg;

	}
	public static void main(String[] args) {
		Function<String, String> f1=FuntionProgram1::show;
		System.out.println(f1.apply(" Ameer"));
	}

}
