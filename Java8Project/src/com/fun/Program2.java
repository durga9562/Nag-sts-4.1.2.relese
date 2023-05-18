package com.fun;

@FunctionalInterface
interface fun2 {
	void phone();
	

	default void samsung(int i) {
		System.out.println("Welcome to ameer " + i);
	}

	static void oneplus(String ph) {
		System.out.println("Oneplus " + ph);
	}

}

public class Program2 {
	public static void main(String[] args) {
//		fun2 ff=new fun2() {
//			
//			@Override
//			public void phone() {
//				System.out.println("Ameer");
//				
//			}
//		};
//		ff.phone();
//		ff.samsung(85);
//		fun2.oneplus("nord 1");
		
		
		fun2 f2 =() -> System.out.println("aaaaa");
		f2.phone();
		f2.samsung(489);
		fun2.oneplus("nord");

	}

}
