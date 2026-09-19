package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.Arrays;

public class SmallestAndBiggestNumbersInArray {

	public static void main(String... arg) {
		int arr[] = new int[] { 14, 54, 4, 8, 784, 245 };

		// Using arrays.sort method
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);

		// without using Arrays.sort method

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Smallest Number : "+arr[0]);
		System.out.println("Biggest Number: "+ arr[arr.length - 1]);

	}

}
