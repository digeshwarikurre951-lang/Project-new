package com.demo;

public class Demo{
	public static void main(String[] args) {
		int _x = 10;
		System.out.println(_x);
		int x___y = 20;
		int $xy = 30;
		int y$$$x$ = 55;
		System.out.println(x___y);
		System.out.println($xy);
		System.out.println(y$$$x$);		
//		int #y = 40;  //not alowed
		
//		int a = 10_;  //underscore is not allwoed in the starting and end of the number
		int b = 10_000;
		int c = 10_00_00;
		int d = 10__00_0;
		float e = 10_1.5f;
		System.out.println(b + " " + c + " " + d + " " + e);
//		float f = 10_.561;   not allowed
//		float g = _ 10; not allowed
		

	}

}