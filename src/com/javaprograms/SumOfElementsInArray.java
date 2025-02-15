package com.javaprograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		int sum = 0;
		
		for(int i : array) {
			sum = sum+i;
		}
		System.out.println("Sum of all elements in an array is : "+sum);
	}
}
