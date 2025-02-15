package com.javaprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetNumbersFromString {

	public static void main(String[] args) {
		String str = "sadiq123 basha 45 shaik678";
		
		Pattern p = Pattern.compile("[0-9]+"); // Pattern p = Pattern.compile("[a-zA-Z]+");
		
		Matcher match = p.matcher(str);
		
		while(match.find()) {
			System.out.println(match.group());
		}
		

	}

}
