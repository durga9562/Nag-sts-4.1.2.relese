package com.fun;

@FunctionalInterface
interface fun1 {
	void life(String msg);

	default void sun() {
		System.out.println("sun");
	}

	static void moon() {
		System.out.println("moon");
	}

}

public class Program1 implements fun1 {

	@Override
	public void life(String msg) {
		System.out.println("Welcome to your life" + msg);

	}

	public static void main(String[] args) {

		Program1 p1 = new Program1();
		p1.life(" ameer");
		p1.sun();

		fun1.moon();
	}

}
