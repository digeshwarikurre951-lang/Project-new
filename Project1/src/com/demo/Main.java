package com.demo;

public class Main{
	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.brand = "Msft";
		r1.os = "win";
		r1.processor = "mp";
		
		System.out.println("Brand :"+ r1.brand);
		System.out.println("Brand :"+ r1.os);
		System.out.println("Brand :"+ r1.processor);
		
		r1.move();
		r1.light();
	}
}