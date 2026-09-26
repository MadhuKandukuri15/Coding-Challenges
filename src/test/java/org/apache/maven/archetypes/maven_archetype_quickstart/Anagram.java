package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		try {

			String name1 = input.nextLine().toLowerCase();
			String name2 = input.nextLine().toLowerCase();
			if (name1.length() == name2.length()) {
				String arr1[] = name1.split("");
				String arr2[] = name2.split("");
				Arrays.sort(arr1);
				Arrays.sort(arr2);

				if (Arrays.equals(arr1, arr2)) {
					System.out.println("Entered strings are anagrams");
				} else {
					System.out.println("Entered strings are not anagrams");
				}

			} else {
				System.out.println("Entered strings are not anagram");
			}

		} catch (Exception e) {
			System.out.println("please enter string");
		}

		finally {
			input.close();
		}
	}
}
