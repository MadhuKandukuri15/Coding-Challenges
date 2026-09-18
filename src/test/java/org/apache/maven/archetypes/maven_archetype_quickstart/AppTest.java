package org.apache.maven.archetypes.maven_archetype_quickstart;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

   public static void main(String...arg) {
	   int arr[] = new int[] {14,54,4,8,784,245};
	   Arrays.sort(arr);
	   System.out.println(arr[0]);
	   System.out.println(arr[arr.length-1]);
   }
	
}
