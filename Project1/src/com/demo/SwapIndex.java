package com.demo;
import java.util.*;

public class SwapIndex{
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter 1st index value : ");
		int Idx1= sc.nextInt();
		System.out.print("Please enter 2nd index value : ");
		int Idx2= sc.nextInt();
		
		int temp = a[Idx1];
		a[Idx1] = a[Idx2];
		a[Idx2] = temp;
		
		System.out.println("swaped value of Idx1 :" + a[Idx1] ) ;
		System.out.println("swaped value of Idx2 :" + a[Idx2]);
		
	}
}