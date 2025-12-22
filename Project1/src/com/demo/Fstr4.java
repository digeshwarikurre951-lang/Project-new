package com.demo;

public class Fstr4{
	public static void main(String[] args) {
		String S1 = "Md";
		String S2 = "Arsh";
		
		S1 = S1.concat(S2);
		System.out.println(S1);
		
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