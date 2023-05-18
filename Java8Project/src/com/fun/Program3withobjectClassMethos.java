package com.fun;

@FunctionalInterface
interface fun3 {
	
	
	void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  

}

public class Program3withobjectClassMethos {
	public static void main(String[] args) {

		fun3 f3 = (aa) -> System.out.println("Ameer"+aa);
		f3.say("ameer");
		System.out.println(f3.hashCode());
		System.out.println(f3.toString());
		System.out.println(f3.equals(f3));
	}
}
