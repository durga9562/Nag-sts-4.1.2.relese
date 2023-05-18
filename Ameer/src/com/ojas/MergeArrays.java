package com.ojas;

import java.util.Arrays;
import java.util.Collections;

public class MergeArrays {
	public static void main(String[] args) {
		int[] firstArray = { 56, 78, 90, 74, 32, 67, 12 }; // initialized array
		int[] secondArray = { 11, 14, 9, 5, 2, 23, 15 };
		int length = firstArray.length + secondArray.length; // add the length of firstArray into secondArray
		int[] mergedArray = new int[length]; // resultant array
		int pos = 0;
		for (int element : firstArray) // copying elements of secondArray using for-each loop
		{
			mergedArray[pos] = element;
			pos++; // increases position by 1
		}
		for (int element : secondArray) // copying elements of firstArray using for-each loop
		{
			mergedArray[pos] = element;
			pos++;
		}
		System.out.println(Arrays.toString(mergedArray)); // prints the resultant array
		Arrays.sort(mergedArray);
		System.out.println(Arrays.toString(mergedArray));

		int len = mergedArray.length;

		if (len % 2 == 0) {
			int mid = length / 2;
			System.out.println((mergedArray[mid] + mergedArray[mid - 1]) / 2);
		} else {
			System.out.println(mergedArray[(mergedArray.length) / 2]);
		}
	}

}
