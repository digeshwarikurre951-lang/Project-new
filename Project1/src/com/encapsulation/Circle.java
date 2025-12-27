package com.encapsulation;

class Circle {
	int r;
	static float pi = 3.14f;

	public Circle(int r) {
		this.r = r;

	}

	float disp() {
		float area = pi * r * r;
		return area;
	}

	public class CircleApp {
		public static void main(String[] args) {
			Circle c1 = new Circle(10);
			System.out.println(c1.disp());
		}
	}
}
