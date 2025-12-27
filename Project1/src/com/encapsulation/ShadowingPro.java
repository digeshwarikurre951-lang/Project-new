package com.encapsulation;

class Shadow{
	private String name;
	private int age;
	private String gender;

	public Shadow(String name, int age, String gender) {
		name = name;
		age = age;
		gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getage() {
		return age;
	}

	public String getgender() {
		return gender;
	}
}

public class ShadowingPro {
	public static void main(String[] args) {
		
		Shadow s1 = new Shadow("Danish",22,"Male");
		
		System.out.println("Employee name is:" + s1.getName());
		System.out.println("Employee age is:" + s1.getage());
		System.out.println("Employee gender is:" + s1.getgender());
	}
}

