package com.javaex.ex03; 	


public class MyListApp {

	public static void main(String[] args) {
		
		//도형생성
		Point p01 = new Point(4,7);
		Point p02 = new Point(8,17);
		
		Circle c01 = new Circle(5);
		
		
		
		//포인트(점) 관리
		MyList<Point> pList = new MyList<Point>();  //Point 만 관리
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.toString());
	
		//Circle(원) 관리
		MyList<Circle> cList = new MyList<Circle>();  //Circle만 관리
		cList.add(c01);
		//cList.add(p01);   // <-- 제네릭으로 정의한 클래스 이외의 다른값은 오류발생
		
		System.out.println(cList.get(0));  // <--- 다운캐스팅 하지 않아도 됨
		
		
		System.out.println(cList.toString());
				
	
		

	}

}