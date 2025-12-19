package com.demo;

import java.util.Scanner;

public class Arrays{
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the no. of students present in class ");
	int n = sc.nextInt();
	int a[]=new int[n];
	
	for(int i=0;i<a.length;i++) {   //a.length because of generic loop 
		System.out.println("Please Enter your marks " + i);
		a[i]=sc.nextInt();
	}
	 
	for(int i=0;i<a.length;i++) {   //a.length because of generic loop 
 		System.out.print(a[i]+" ");	
	}
  }
}

//hard code
//System.out.println("Enter your marks:");
//a[0]=sc.nextInt();
//System.out.println("Enter your marks:");
//a[1]=sc.nextInt();
//System.out.println("Enter your marks:");
//a[2]=sc.nextInt();
//System.out.println("Enter your marks:");
//a[3]=sc.nextInt();
//System.out.println("Enter your marks:");
//a[4]=sc.nextInt();	

//System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] +" "+ a[4]);