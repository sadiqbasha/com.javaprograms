package com.javaprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		 Integer[] array = {10, 30, 5, 3, 0, 1};

	        // Convert array to list and reverse
	        List<Integer> list = Arrays.asList(array);
	        Collections.reverse(list);

	        // Print the reversed array
	        System.out.println("Reversed array: " + list);

	}

}
