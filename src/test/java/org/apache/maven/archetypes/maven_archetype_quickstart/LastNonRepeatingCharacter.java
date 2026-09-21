package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class LastNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String name = sc.nextLine();
		name = name.replaceAll("[^A-Za-z]", "");
		LinkedHashMap<Character, Integer> lh = new LinkedHashMap<>();
		for (char c : name.toCharArray()) {
			if (lh.containsKey(c)) {
				lh.put(c, lh.get(c) + 1);
			} else {
				lh.put(c, 1);

			}
		}
		boolean b = false;
		char s = ' ';
		for (Entry<Character, Integer> e : lh.entrySet()) {

			if (e.getValue() == 1) {
				b = true;
				s = e.getKey();
			} else {
				b = false;
			}

		}
		if (b) {
			System.out.println("last non repeating character : " + s);
		}
		else {
			System.out.println("There is no non repeating character");
		}

	}

}
