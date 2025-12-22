package com.demo;

public class Muteable{
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();	
////		System.out.println(sb);
//		System.out.println(sb.capacity());
//		sb.append("Ronaldo");
//		System.out.println(sb.capacity());
//		sb.append("is a greatn footballer");
//		System.out.println(sb.capacity());
		
//		StringBuffer sb = new StringBuffer(10);
//		System.out.println(sb.capacity());
		
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.ensureCapacity(31);
//		System.out.println(sb.capacity());

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Ronaldo");
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}