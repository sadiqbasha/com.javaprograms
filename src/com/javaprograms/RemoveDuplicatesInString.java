package com.javaprograms;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		 String input = "sadiqbashashaik";
	      char[] characters = input.toCharArray();
	        String result = "";
	        
	        for (char character : characters) {
	            if (!result.contains(String.valueOf(character))) { // In Java, String.valueOf(character) 
	            	                               // is a method that converts a char (character) into a String.
	            	                              // (!result.contains(String.valueOf(character)))
	            	                             //meaning it checks if the result does NOT contain the character.
	                result = result+character;
	            }
	        }
	        
	        System.out.println("After removing duplicates : "+result);

	}

}
