package Inheritance;

public class RuleTwo{
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println("--------------------------");
		c.disp(); //the field parent is not accesible because the method is private now!!!
		
	}
}

class Parent{
	private int a = 10;
	int b = 20;
	private void disp() {
		System.out.println(a);
		System.out.println(a);
	}
}

class Child extends Parent{
	
}