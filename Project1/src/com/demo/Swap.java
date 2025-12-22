package com.demo;
import java.util.*;

public class Swap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your no to swaap (A) : ");
		int a = sc.nextInt();
		System.out.print("Enter your no to swaap (B) : ");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Swapped number of A : " + a);
		System.out.println("Swapped number of B : " + b);
	}
	
}