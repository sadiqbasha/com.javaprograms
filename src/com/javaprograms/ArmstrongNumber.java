package com.javaprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number to check if it is an Armstrong number:");
	        int number = sc.nextInt();
	        sc.close();

	        int temp = number; // Store the original number
	        int sum = 0;       // Initialize sum
	        int r;             // Variable to hold individual digits

	        // Process each digit
	        while (number > 0) {
	            r = number % 10;           // Extract the last digit
	            sum = sum + (r * r * r);   // Add the cube of the digit to sum
	            number = number / 10;      // Remove the last digit
	        }

	        // Check if the sum of cubes equals the original number
	        if (sum == temp) {
	            System.out.println(temp + " is an Armstrong number.");
	        } else {
	            System.out.println(temp + " is not an Armstrong number.");
	        }
		}
}
