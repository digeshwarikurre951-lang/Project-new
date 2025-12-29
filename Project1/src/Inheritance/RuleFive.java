package Inheritance;

public class RuleFive{
	public static void main(String[] args) {
		Child3 c = new Child3();
		System.out.println(c.a);
		System.out.println(c.b);
	}
}

class GrandParent{
	int a = 10;
	
}


class Parent4 extends GrandParent{
	int b = 20;
	
}

class Child3 extends Parent4{           

}