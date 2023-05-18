package com.fun;

import java.util.function.Supplier;

public class SupplierProgram {
	public static void main(String[] args) {
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
	}

}
