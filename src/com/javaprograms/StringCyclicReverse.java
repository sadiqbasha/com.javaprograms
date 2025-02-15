package com.javaprograms;

public class StringCyclicReverse {

	public static void main(String[] args) {
		 String str = "sadik";
	        int len = str.length();
	        
	        for (int i = 0; i < len; i++) {
	            String rotated = str.substring(i) + str.substring(0, i);
	            System.out.println(rotated);
	        }
	}
}
/* output:
sadik
adiks
diksa
iksad
ksadi */