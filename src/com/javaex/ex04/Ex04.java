package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		
		Point p01 = new Point(3,13);
		Point p02 = new Point(4,14);
		Point p03 = new Point(3,13);
		
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		
	}

}
