package com.demo;

public class Str5{
	public static void main(String[] args) {
		String S1 = "Md ";
		String S2 = "Arsh";
		
		String S3 = S1.concat(S2);
		String S4 = "Md Arsh";
//		System.out.println(S1);
		
		if(S3==S4) {
			System.out.println("Refrences are Equals");
		} else {
			System.out.println("Refrence are not equal");
		} if(S3.equals(S4)) {
			System.out.println("Values are equal");
		} else {
			System.out.println("Values are not equal");
		}
    } 	
}