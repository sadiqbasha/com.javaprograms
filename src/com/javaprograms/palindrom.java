package com.javaprograms;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a string to check it is palindrom or not");
	  String str = sc.nextLine();
	  str = str.toLowerCase();
	  
	  String revesre = new StringBuffer(str).reverse().toString();
	  
	  if(str.equals(revesre)) {
		  System.out.println(str+" is a palindrome");
	  }
	  else {
		  System.out.println(str+" is not a palindrome");
	  }

	}

}
