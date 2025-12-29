package Inheritance;

public class ParentApps {
	public static void main(String[] args) {
		Childd1 c = new Childd1(100,99);
		System.out.println(c.a + " " + c.b);
	}
}

class Parents1 {
	int a;
	int b;

	public Parents1() {
		this(99,99);
		a = 10;
		b = 20;
		System.out.println("zero parametrized parent");
	}

	public Parents1(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("two parametrized parent");
	}
}

class Childd1 extends Parents1 {
	public Childd1() {
		a = 30;
		b = 40;
		System.out.println("zero parametrized child");
	}

	public Childd1(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("two parametrized child");
	}
}
