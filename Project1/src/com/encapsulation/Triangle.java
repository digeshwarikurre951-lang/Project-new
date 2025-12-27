package com.encapsulation;
import java.util.*;

class Triangle {
	int b;
	int h;
	static float half = 0.5f;

	public Triangle(int b, int h) {
		this.b = b;
		this.h = h;

	}

	float disp() {
		float area = half * b * h;
		return area;
	}

	public class TriangleApp {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your base of triangle: ");
			int b = sc.nextInt();
			System.out.println("enter your height of triangle: ");
			int h = sc.nextInt();
			Triangle t = new Triangle(b,h);
			System.out.println("Area of Tiangle is : "+t.disp());
			
		}
	}
}


