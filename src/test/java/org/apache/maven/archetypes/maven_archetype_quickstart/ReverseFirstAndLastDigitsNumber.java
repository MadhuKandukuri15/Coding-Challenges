package org.apache.maven.archetypes.maven_archetype_quickstart;

public class ReverseFirstAndLastDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1245;
		// first digits count chesukovali
		int digits = 0;
		int temp = num;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}

		// first digit ni extract chesukovali
		
		temp = num;
		int firstDigit = 0;
		while (temp >= 10) {
			temp = temp / 10;
		}
		firstDigit = temp;
		
		// ippudu last digit ni extract chesukovali
		
		int lastDigit = num % 10;

		// ippudu middle digit ni extract chesukovali
		
		int middleDigit = num % (int) Math.pow(10, digits - 1); // remove first digit
		middleDigit /= 10; // remove last digit
		
		int result = lastDigit;
        for (int i = 1; i < digits; i++) {
            result *= 10;
        }
        result += middleDigit * 10 + firstDigit; 
        System.out.println(result);
	}
	

}
