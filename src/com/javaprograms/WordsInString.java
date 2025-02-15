package com.javaprograms;

import java.util.Scanner;

public class WordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		sc.close();
		String[] words = str.split("\\s");
		int count = words.length;
		System.out.println("No.of words are: "+count);
	}
}
