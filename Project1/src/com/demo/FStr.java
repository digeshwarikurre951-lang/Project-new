package com.demo;

public class FStr{
	public static void main(String[] args) {
		String S1 = "Arsh";
		String S2 = "Arsh";
		
		if(S1==S2) {
			System.out.println("Refrences are Equals");
		} else {
			System.out.println("Refrence are not equal");
		} if(S1.equals(S2)) {
			System.out.println("values are equal");
		} else {
			System.out.println("values are not equal");
		}
    } 	
}