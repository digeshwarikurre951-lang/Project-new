package Inheritance;

public class ParentApp {
	public static void main(String[] args) {
		Childd c = new Childd();
		System.out.println(c.a + " " + c.b);
	}
}

class Parents {
	int a;
	int b;

	public Parents() {
		a = 10;
		b = 20;
	}

	public Parents(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Childd extends Parents {
	public Childd() {
		a = 30;
		b = 40;
	}

	public Childd(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
