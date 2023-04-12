package com.javalan.exception.pkg01;

public class NumberFormatExample { // class s
	
	public static void main(String[] args) { // main s
		
		String strNum = "20o";
		int intNum = Integer.parseInt(strNum);	// Integer.parseInt( ) : 문자열을 Int타입으로
		System.out.println(strNum + " " + intNum);
	} // main e

} // class e
