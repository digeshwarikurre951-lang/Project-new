package com.demo;

import java.util.*;

public class Find{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = {1,20,3,4,20,6,9};

		
		System.out.print("Enter your number: ");
		int key = sc.nextInt();
		
		boolean found = false;
		int idx =0;
		
		for(int i=0; i<a.length;i++) {
			if(a[i] == key) {
				found = true;
				idx=i;
				break;
			}
	}
		if(found == true) {
			System.out.println("Key found at index :" + idx);
		} else {
			System.out.println("Key not found");
		}
  }
}
