package com.javaprograms;

import java.util.Scanner;

public class FibanacciSeries { // 0 1 1 2 3 5 8 13

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit to displaye Fibanacci series");
		long limit = sc.nextLong();
		
		System.out.println("Enter first number");
		long x = sc.nextLong();
		
		System.out.println("Enter second number");
		long y = sc.nextLong();
		System.out.print(x+" "+y);
		
		do {
			long z = x+y;
			System.out.print(" "+z+" ");
			x=y;
			y=z;
		}while((x+y)<limit);
		
	}
}
