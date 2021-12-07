//2021.12.7(화)09:58 수업

package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List; //ctrl + shift + O: import셍성 or import정리

public class Ex01 {

	public static void main(String[] args) {

		Point p01 = new Point(2, 12);
		Point p02 = new Point(3, 13);
		Point p03 = new Point(7, 17);

		//	섞어쓰기 한 이유: 기존에 잘 이용해오던 부모클래스로부터 구현받고 새 메소드를 추가하는 게 안전하기 때문에 자식 클래스로 곧장 가게 안 하고 섞어 쓴다
		List<Point> pList = new ArrayList<Point>();
		pList.add(p01); // 주소를 추가하는 과정
		pList.add(p02);
		pList.add(p03);

		// 갯수 출력하기: size
		System.out.println(pList.size());

		// 관리되고 있는 Point에 접근하기
		System.out.println(pList.get(1).getX());
		System.out.println(pList.get(1).toString());

		// 전체 출력하기
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).getY());
		}

		System.out.println("==================================");

		// 데이터 지우기: 리무브해서 1번방 지우면 2번방이 1번으로 당겨짐
		pList.remove(1);
		pList.remove(p02);
		System.out.println(pList.size());
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		System.out.println("==================================");
		System.out.println(pList.get(1).toString());

		// add를 이용해 원하는 위치에 주소 넣기
		System.out.println("==================================");
		pList.add(1, p02);
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		// 출력해볼 때마다 매번 for문을 쓸 필요 없을 땐 toString
		System.out.println("==================================");
		System.out.println(pList.toString());
		
		
		//	향상된 for문: 처음부터 끝까지
		for(Point p : pList) {
			System.out.println(p.getX());
		}
		
	}

}
