package com.ojas;

public class Test {
	
	private void m1(Object t) {
		System.out.println("object");
	}
//	private void m1(String s) {
//		System.out.println("String");
//		}
	

	public static void main(String[] args) {
		Test obj=new Test();
		obj.m1(null);
	}

}
