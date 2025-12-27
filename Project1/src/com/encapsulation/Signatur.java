package com.encapsulation;

public class Signatur{
	final synchronized  public static void main(String[] args) {
		main(6);
		main('a');
		main(4.56f);
		main(true);
		
	}
	public static void main(int args) {
		System.out.println(78);
	}
	public static void main(char args) {
		System.out.println('@');
	}
	public static void main(float args) {
		System.out.println("2.5f");
	}
	public static void main(boolean args) {
		System.out.println("Yes");
	}
}

