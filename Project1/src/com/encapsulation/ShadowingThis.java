package com.encapsulation;

class Shadowin{
	private String name;
	private int age;
	private String gender;

	public Shadowin(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
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

public class ShadowingThis {
	public static void main(String[] args) {
		
		Shadowin s1 = new Shadowin("Danish",22,"Male");
		
		System.out.println("Employee name is: " + s1.getName());
		System.out.println("Employee age is: " + s1.getage());
		System.out.println("Employee gender is: " + s1.getgender());
	}
}