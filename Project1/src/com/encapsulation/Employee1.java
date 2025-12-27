package com.encapsulation;

class Employee1 extends Object{
	int emp_id;
	String name;
	int salary;
	
	public Employee1(int emp_id,String name,int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}


public int getemp_id(){
	return emp_id;
}
public String getname() {
	return name;
}
public int getsalary() {
	return salary;
}
}

class Employ{
	public static void main(String[] args) {
		Employee1 e = new Employee1(101,"Arsh",20000);
		System.out.println(e.getemp_id());
		System.out.println(e.getname());
		System.out.println(e.getsalary());
	}
}

//public class Object{
//	public Object() {
//		//initialize method
//		
//	}
//}


