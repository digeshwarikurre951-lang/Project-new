package com.demo;
public class Upp{
	public static void main(String[] args) {
		
		String S1 = "Danish Sheikh";
//		String res =S1.toUpperCase(); //new object created 
		
		System.out.println("Values in Upper Case : "+S1.toUpperCase()); //for immutable 
		System.out.println("Values in Lower case : "+S1.toLowerCase());
		System.out.println("Values contains in an object or not : "+S1.contains("Da"));
		System.out.println("Index value of containg elements in object : "+S1.indexOf("sh"));
		System.out.println("To print the elements of object "
				+ "using thier index value : "+S1.substring(0,2));
		System.out.println(S1.charAt(3));
		
	}
}