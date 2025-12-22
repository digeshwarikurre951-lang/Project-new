package com.demo;

public class Fstr3{
	public static void main(String[] args) {
		String S1 = "Arsh";
		String S2 = "arsh";
		
		if(S1==S2) {
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