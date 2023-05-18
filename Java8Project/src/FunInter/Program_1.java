package FunInter;

@FunctionalInterface
interface a1 {
	void m1();
	

	default void m2() {
		System.out.println("M2");
	}

	static void m3() {
		System.out.println("m3");
	}
}

public class Program_1 {
	public static void main(String[] args) {
		a1 a;
		a = () -> System.out.println("M1");
		a.m1();

		a.m2();
		a1.m3();
	}
}
