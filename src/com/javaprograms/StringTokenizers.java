package com.javaprograms;

import java.util.StringTokenizer;

public class StringTokenizers {

	public static void main(String[] args) {
		//StringTokenizer st = new StringTokenizer("sadiq basha shaik");
		StringTokenizer st = new StringTokenizer("sadiq-basha-shaik","-");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
