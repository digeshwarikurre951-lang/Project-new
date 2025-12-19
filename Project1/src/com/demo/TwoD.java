package com.demo;

import java.util.*;

public class TwoD{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		
	    int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {       
			  System.out.print("Please enter the marks of class " + i + " student " + j + " ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("All marks in 2D Array");
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}