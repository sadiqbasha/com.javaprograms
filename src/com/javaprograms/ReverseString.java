package com.javaprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println("Reverse string is :"+reverse);
	}
}*/
//  public class ReverseWords {
//    public static void main(String[] args) {
        String str = "my name is sadiq"; //Output: ym eman si qidas
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result);
    }
} 
