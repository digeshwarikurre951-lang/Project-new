package com.demo;

public class Example{
	public static void main(String[] args) {

		int[] a= new int[5];
		a[0]=99;
		a[1]=10;
		a[2]=99;
		a[3]=10;
		a[4]=99;
		
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i] + " ");	
		}
	}
	
}
