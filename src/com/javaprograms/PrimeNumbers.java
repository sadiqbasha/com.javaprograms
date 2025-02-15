package com.javaprograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		if(number<=1) {
			System.out.println(number+" is not a prime number");
			return;
		}
		boolean isPrime = true;
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
			isPrime = false;
			break;
		   }
		}
		
		if(isPrime) {
			System.out.println(number+" is a prime number");
		}
		else {
			System.out.println(number+" is not a prime number");
		}

	}

}
