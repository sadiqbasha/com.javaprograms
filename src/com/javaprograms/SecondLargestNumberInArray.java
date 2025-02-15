package com.javaprograms;

import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
      int[] numbers = {2,5,6,7,10,11};
      
      Arrays.sort(numbers);
      
      int secondLargestNumber = numbers[numbers.length-2];
      System.out.println("secondLargestNumber is : "+secondLargestNumber);
      System.out.println(numbers.length);     
	}
}
