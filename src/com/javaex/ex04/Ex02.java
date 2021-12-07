package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {

		// generic은 기본 자료형일 지라도 클래스를 써줘야 함
		// 정수형 관리
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(24);
		Integer i03 = new Integer(7);
		
		int i04 = 100;
		Set<Integer> iSet = new HashSet<Integer>();
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		for(Integer no : iSet) {
			System.out.println(no.toString());
			//내가 넣은 순서와 관계 없이 나옴
		}
		
		System.out.println("=====================");
		
		//	Point 관리
		Point p01 = new Point(3,13);
		Point p02 = new Point(4,14);
		Point p03 = new Point(4,15);
		Point p04 = new Point(3,13);
		
		Set<Point> pSet =	new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		//pSet.remove(p02);
		System.out.println("겟수: " + pSet.size());
		
		// 주소인데 따라가보면 Integer가 있음
		for(Point i:pSet) {
			System.out.println(i.getX());
		}

		System.out.println(pSet.toString());
		
	}

}

// WrapperClass부분참고: 대문자로 쓰면 필드와 메소드도 같이 '박싱'되어 생성됨
