package com.demo;

public class ReverseA{
	public static void main(String[] args) {

		int[] a= new int[5];
		a[0]=99;
		a[1]=50;
		a[2]=39;
		a[3]=10;
		a[4]=20;
		
		int[] b = new int[a.length];
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			b[i]=a[j];
			j--;
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i] + " ");	
		}
	}
	
}