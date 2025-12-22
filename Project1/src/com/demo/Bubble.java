package com.demo;

public class Bubble{
	public static void main(String[] args) {
		
		int a[] = {10,30,50,20,40};
		
		for(int m=0;m<a.length;m++) {
			System.out.print(a[m]+ " ");
	}
		System.out.println(""); 
		System.out.println("***************************** "); 	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					break;	
				}				
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
	}
	}
}
		