package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.Arrays;

public class SecondSmallestNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Testing5478913";
		String res = s.replaceAll("[^0-9]", "");
		System.out.println(res);
		int arr[] = new int[res.length()];
		for (int i = 0; i < res.length(); i++) {
			char n = res.charAt(i);

			arr[i] = Character.getNumericValue(n);

		}
		Arrays.sort(arr);
		System.out.println(arr[1]);

		String num = "";

		// using ascii values

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				num = num + s.charAt(i);
			}
		}
		char ch;
		int a[] = new int[num.length()];
		for (int k = 0; k < num.length(); k++) {
			a[k] = Character.getNumericValue(num.charAt(k));
		}
		Arrays.sort(a);
		System.out.println(a[1]);
	}

}
