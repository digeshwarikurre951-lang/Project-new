package com.demo;

import java.util.Scanner;

public class Array1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter total number of Students :");
		int n = sc.nextInt();
		
		String a[] = new String[n];
		for(int i=0;i<a.length;i++) {
			System.out.print("Please Enter your name "+ i +":");
			a[i] = sc.nextLine();
			sc.next();
		}
	}
}
