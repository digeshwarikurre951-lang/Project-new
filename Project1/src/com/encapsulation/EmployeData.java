package com.encapsulation;

class Employe {
	private String name;
	private int id;
	private int salary;

	public Employe(String n, int i, int s) {
		name = n;
		id = i;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public int getage() {
		return id;
	}

	public int getgender() {
		return salary;
	}
}

public class EmployeData {
	public static void main(String[] args) {
		
		Employe e1 = new Employe("Danish",202,750000);
		
		System.out.println("Employee name is:" + e1.getName());
		System.out.println("Employee id is:" + e1.getage());
		System.out.println("Employee Salary is:" + e1.getgender());
		
	}
}








