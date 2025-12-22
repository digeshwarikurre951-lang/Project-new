package com.demo;

public class Fstr5{
	public static void main(String[] args) {
		String S1 = new String("Deep");
		
		String S2 = S1.intern(); ;
		
		String S3 = S1.intern();
		
		if(S2==S3) {
			System.out.println("Refrences are Equals");
		} else {
			System.out.println("Refrence are not equal");
		} if(S1.equals(S2)) {
			System.out.println("Values are equal");
		} else {
			System.out.println("Values are not equal");
		}
    } 	
}