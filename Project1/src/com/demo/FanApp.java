package com.demo;
public class FanApp{
	public static void main(String[] args) {
		Fan F1 =new Fan();
		
		Fan F2 =new Fan();
		
		System.out.println("Before Assigning in F1");
		
		System.out.println(F1.brand);
		System.out.println(F1.cost);
		System.out.println(F1.color);
		
		System.out.println("After Assiging in F1");
		
		F1.brand = "BMW";
		F1.cost = 45263;
		F1.color = "Black";
		
		System.out.println(F1.brand);
		System.out.println(F1.cost);
		System.out.println(F1.color);
		
        System.out.println("Before Assigning in F2");
		
		System.out.println(F2.brand);
		System.out.println(F2.cost);
		System.out.println(F2.color);
		
		System.out.println("After Assiging in F2");
		
		F2.brand = "TWF";
		F2.cost = 65879;
		F2.color = "Red";
		
		System.out.println(F2.brand);
		System.out.println(F2.cost);
		System.out.println(F2.color);
		
	}
}