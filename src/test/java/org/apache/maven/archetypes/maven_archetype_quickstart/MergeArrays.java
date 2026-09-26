package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 1, 5, 7, 2, 3 };
		int arr1[] = new int[] { 1, 8, 7, 2, 78 };
		int mergedArray[] = new int[arr.length + arr1.length];
		System.arraycopy(arr, 0, mergedArray, 0, arr.length);

		System.arraycopy(arr1, 0, mergedArray, arr.length, arr1.length);
		System.out.println(Arrays.toString(mergedArray));
		for (int i : mergedArray) {
			System.out.print(i);
		}

	}

}
