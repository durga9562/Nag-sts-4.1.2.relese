package normal;

public class swap {
	public static void main(String[] args) {

		int a = 10;
		int b = 23;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Swap with out temp " + a + "  " + b);

		int x = 40;
		int y = 34;

		int z;

		z = x;
		x = y;
		y = z;
		System.out.println("With temp " + x + " " + y);

		int l = 14;
		int m = 96;
		int n = 64;
		int o;

		o = l;
		l = m;
		m = n;
		n = l;
		

		System.out.println("swap three variables " + l + " " + m + " " + n);

	}

}
