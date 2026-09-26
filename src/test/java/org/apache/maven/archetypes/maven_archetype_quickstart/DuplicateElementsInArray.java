package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 3,2,2 };
		 Map<Integer, Integer> countMap = new HashMap<>();

	        for (int num : arr) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }

	        System.out.println("Duplicate elements:");
	        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
	            }
	        }
	}

}
