package com.demo;
import java.util.*;

public class Registration{
	public static void main(String[] args) {
		
System.out.println("*************************************");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Name           :" );
		String name =sc.nextLine();

		System.out.print("Enter your Age            :");		
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter your Gender         :");
		String gender = sc.nextLine();

		System.out.print("Enter your Mobile Number  :");
		String Mob_no = sc.nextLine();
		
		System.out.print("Enter your Address        :");
		String Address = sc.nextLine();
		
		System.out.print("Enter your College ID     :");
		int Clg_id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter your College Name   :" );
		String Clg_name = sc.nextLine();
		
		System.out.print("Enter your Adhar Number   :");
		String Adhar_No = sc.nextLine();
		
		System.out.print("Enter your Emaid ID       :");		
		String email = sc.nextLine();
		
		System.out.print("Enter your Status         :");
		String Status = sc.nextLine();
		
		System.out.println("Form completed Succesfully");
		
		System.out.println("*************************************");
		}
}
