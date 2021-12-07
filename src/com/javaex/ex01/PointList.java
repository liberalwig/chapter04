package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	// 필드
	private Point[] pArray;
	private int crtPos;

	// 생성자
	public PointList() {
		this.pArray = new Point[3];
		this.crtPos = 0;
	}

	// 메소드 일반
	public void add(Point p) {
		pArray[crtPos] = p;
		crtPos++;
	}
	
	public Point get(int index) {
		Point result = pArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
/*
오히려 이 경우엔 아래와 같이 만들면 위험해짐. 위 생성자는 꼭 써줘야 함. public PointList(Point[] pArray,
int crtPos) { this.pArray = pArray; this.crtPos = crtPos; }
	
메소드일반에 addPoint p {주소가 들어오면 배열의 마지막에 Point를 넣는다}
get(index no) {배열의 index방 주소를 리턴해준다}
size() {현재 관리되고 있는 point개수를 리턴해준다}

PointList라는 클래스에서, 생성자: public PointList(){배열을 만들어준다} = this.pArray = new Point[3]
PointList라는 클래스에서, 메소드: public void add(Point p) {pArray[0] = p;} 아래 두 행의 수정 사항 때문에 pArray[0] = p;에서 pArray[crtPos] = p, crtPos++;
그런데 매번 채워지는 것 만큼 뒤로 물러나도록 하고 싶기 때문에 필드에 추가를 해주자
PointList라는 클래스에서, 필드: private int crtPos; (:add할 때 point가 들어갈 자리), 그래서 생성자에: this.crtPos = 0;
*/
}
