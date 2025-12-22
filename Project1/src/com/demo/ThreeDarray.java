package com.demo;
import java.util.*;

public class ThreeDarray{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter no. of colleges: ");
		int m = sc.nextInt();
		
		System.out.println("Enter no. of Classes: ");
		int n = sc.nextInt();
		
		System.out.println("Enter no. of Students: ");
		int o = sc.nextInt();
		
		int a[][][] = new int[m][n][o];
			
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Roll_No of college" + i +" classes"+ j + " Students" + k);

					a[i][j][k] =sc.nextInt();
				}	
			}
		}
		System.out.println("All Roll Numbers :");
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				for(int k=0; k<a[i][j].length;k++) {
					System.out.print(a[i][j][k] +" ");
				}
				System.out.println();
				
			}
		}
		
		
	}
}