package com.javaprograms;

import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter string");
       String input = sc.nextLine();
       sc.close();
       
       if(input.matches(".*[aeiouAEIOU].*")) {
           System.out.println("string has vowels");   
       }
       else {
           System.out.println("string does not have vowels");

       }
	}

}
