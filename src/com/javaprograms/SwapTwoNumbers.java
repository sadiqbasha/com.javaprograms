package com.javaprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int number2 = sc.nextInt();
		
		System.out.println("Before swapping numbers are: "+number1+" & "+number2);
		
	    number1 = number1+number2;
	    number2 = number1-number2;
	    number1 = number1-number2;
	    System.out.println("After swapping numbers are: "+number1+" & "+number2);

	}

}
/* package com.javaprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        // Printing numbers before swapping
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swapping numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Printing numbers after swapping
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}*/

