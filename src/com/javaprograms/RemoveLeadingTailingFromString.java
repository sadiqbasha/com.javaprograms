package com.javaprograms;

import java.util.Scanner;

public class RemoveLeadingTailingFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input = "   Hello, World!   "
		System.out.println("Enter a String");
		 String str1 = sc.nextLine();
		 sc.close();
		 System.out.println("String before removing leading and tailing: "+str1);
		 String str2 = str1.trim(); // str1.strip();
		 System.out.println("String after removing leading and tailing:"+str2);
	}

}
/*Feature	                    trim()	  strip()
Introduced in	               Java 1.0	  Java 11
Removes ASCII spaces (U+0020)	✅	       ✅
Removes Unicode whitespace	    ❌	       ✅
Performance	Slightly          faster	More comprehensive .*/