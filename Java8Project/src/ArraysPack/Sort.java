package ArraysPack;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 6, 9 };

		List<Integer> l1 = new ArrayList<>();

//		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}

}
