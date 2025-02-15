package com.javaprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long number = sc.nextLong();
		long fact = 1;  // 5! = 5x4x3x2x1
		for(long i=1;i<=number;i++) {
			fact = fact*i;
		}
		 System.out.println("Factorial of "+number+" is "+fact);

	}
}
	/* for big integer
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Factorial of " + number + " is " + fact);
    } */


