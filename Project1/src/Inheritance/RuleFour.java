package Inheritance;

public class RuleFour{
	public static void main(String[] args) {
		Child2 c = new Child2();	
	}
}

class Parent2{
	int a = 10;
	public Parent2() {
	System.out.println("this is parent constructor");
	}	
}


class Parent3{
	int b = 20;
	public Parent3() {
	System.out.println("this is parent constructor");
	}	
}

class Child2 extends Parent2,Parent3{           //Syntax Error
	public child2() {
		System.out.println("this is child class");
	}	
}