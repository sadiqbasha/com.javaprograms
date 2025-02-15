package com.javaprograms;

import java.util.Arrays;

public class ArraysContainSameNumbers {

	public static void main(String[] args) {
		// Arrays contains same numbers or not
		int[] array1 = {1,4,5,9,0,10};
		int[] array2 = {0,10,4,9,5,1};
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2)) {
			System.out.println("Arrays contains same elements");
		}
		else {
			System.out.println("Arrays do not contain same elements");
		}
	}
}
