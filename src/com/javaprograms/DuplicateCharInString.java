package com.javaprograms;

import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) {
		// Duplicate Characters In String 
		String str = "sadiqbashashaik";
		char[] carray = str.toCharArray();
		
		System.out.println("Duplicate chars in given string are : ");
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(carray[i]==carray[j]) {
					System.out.print(carray[j]+" ");
					break;
			}
		}
	}
  }
}
