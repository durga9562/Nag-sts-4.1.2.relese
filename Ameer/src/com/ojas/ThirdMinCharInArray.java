package com.ojas;

public class ThirdMinCharInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 1, 5, 6, 7, 6, 1 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

//		for (int i : arr) {
//			System.out.println(arr[i]);
//		}
		// 1,1,1,5,6,6,6,7

		int temp2 = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (temp2 != arr[i]) {
				count++;
				temp2 = arr[i];
			}
			if (count == 2) {
				System.out.println(arr[i]);
			}
		}

	}

}
