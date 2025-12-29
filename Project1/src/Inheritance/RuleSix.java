package Inheritance;

public class RuleSix{
	public static void main(String[] args) {
		Child c = new Child();
	}
}

class Parent extends Child{
	
	
}

class Child extends Parent{           //Cyclic inheritance is not possible in java .

}