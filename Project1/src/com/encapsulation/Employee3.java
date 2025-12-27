package com.encapsulation;

class Employee3 extends Object{
	int emp_id;
	String name;
	int salary;
	
//	public Employee3(int emp_id,String name,int salary) {
//		this.emp_id = emp_id;
//		this.name = name;
//		this.salary = salary;
//	}
	public Employee3() {
		System.out.println("Default Constructor Logic");
	}
	
        public Employee3(int emp_id, String name, int salary) {
	    this.emp_id = emp_id;
	    this.name = name;
        this.salary = salary;
	    System.out.println("Parameterized Constructor Logic");
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

class EmployeeApp4 {
	public static void main(String[] args) {
		
		Employee3 e = new Employee3();
		System.out.println(e.getemp_id());
		System.out.println(e.getname());
		System.out.println(e.getsalary());
		
		Employee3 e1 = new Employee3(101,"Arsh",20000);
		System.out.println(e1.getemp_id());
		System.out.println(e1.getname());
		System.out.println(e1.getsalary());
	}
}
