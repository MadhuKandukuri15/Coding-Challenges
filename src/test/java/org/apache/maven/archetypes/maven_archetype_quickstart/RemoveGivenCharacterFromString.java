package org.apache.maven.archetypes.maven_archetype_quickstart;

public class RemoveGivenCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "madhu";
		char removeChar = 'a';
		String result = name.replace("a", "");
		System.out.println(result);

		// I can code without relying on inbuilt methods

		String withoutUsingBuiltInMethods = removeCharacter(name, removeChar);
		System.out.println(withoutUsingBuiltInMethods);

	}

	public static String removeCharacter(String name, char remove) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != remove) {
				sb.append(name.charAt(i));
			}
		}

		return sb.toString();
	}
}
