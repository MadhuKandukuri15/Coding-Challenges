package org.apache.maven.archetypes.maven_archetype_quickstart;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		// TODO Auto-generated method stub
		try {

			int num = sc.nextInt();
			num = Math.abs(num);
			// convert number to string array
			String str = Integer.toString(num);
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());

			// without converting in to string
			int reversed = 0;
			while (num != 0) {
				int digit = num % 10; // first ikkada digit teesukuntunna endukante reverse variable ki last lo didit
										// add cheyadaniki
				reversed = reversed * 10 + digit;
				num = num / 10;

			}
			System.out.println(reversed);

		} finally {
			System.out.println("finally block executed");
			sc.close();
		}
	}

}
