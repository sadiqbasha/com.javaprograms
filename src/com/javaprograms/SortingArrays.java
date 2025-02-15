package com.javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrays {

	public static void main(String[] args) {
		
		int[] numbers = {10,2,0,1,6,9,3,5,4,7,8,11};
		Arrays.sort(numbers);
		System.out.println("Arrays after sorting "+Arrays.toString(numbers));
	}

}
