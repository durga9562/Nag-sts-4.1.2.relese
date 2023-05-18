package com.ojas;

public class NewPro {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 3, 2, 9, 3, 4, 6, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
		int count = 1;
		int temp = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (temp != arr[i]) {
				count++;
				temp = arr[i];
			}

			if (count == 2) {
				System.out.println("\nThird Min is: " + arr[i]);
				break;
			}
		}
	}

}
