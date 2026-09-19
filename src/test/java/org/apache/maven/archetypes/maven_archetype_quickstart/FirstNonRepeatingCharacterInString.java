package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		char a[] = s.toCharArray();
		for (char c : a) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
					map.put(c, 1);
			}
		}
		System.out.println(map);
		for(Entry<Character,Integer>e:map.entrySet()) {
			
			if(e.getValue()==1) {
				System.out.println(e.getKey());
				break;
			}
		}

	}

}
