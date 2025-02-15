package com.javaprograms;

import java.util.Scanner;

public class NumberOfOccuranceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str1 = sc.nextLine();
		System.out.println("Enter a character to check its no.of occurances");
		String str2 = sc.nextLine();
		
		int count = str1.length()-str1.replaceAll(str2, "").length();
		System.out.println(str2+" is occured "+count+" times");
		
	}

}
