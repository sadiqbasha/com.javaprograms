package com.javaprograms;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str1 = sc.nextLine();
		String str2 = str1.replaceAll("\\s", "");
		System.out.println("String after removing spaces :"+str2);
		
	}
}
