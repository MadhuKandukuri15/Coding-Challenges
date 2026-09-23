package org.apache.maven.archetypes.maven_archetype_quickstart;

public class MoveAllZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] { 1, 0, 4, 0, 5, 0 };
		int result[] = new int[a.length];
		int c = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {

				result[c] = a[i];
				++c;
			}

		}
		for (int j = c; j < a.length; j++) {
			result[c] = 0;
		}
		for (int k = 0; k < result.length; k++) {
			System.out.println(result[k]);
		}

	}

}
