package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String str = input.nextLine().toLowerCase();
		Set<Character> s = new HashSet<>();
		if (str.length() >= 26) {

			for (char a : str.toCharArray()) {
				if (a >= 'a' && a <= 'z') {

					s.add(a);

				}
			}
			if (s.size() == 26) {
				System.out.println("Entered string is Panagram");
			} else {
				System.out.println("Entered string is not Panagram");
			}
		} else {
			System.out.println("Entered string is not paangram");
		}

	}

}
