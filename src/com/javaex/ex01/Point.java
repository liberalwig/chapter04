//2021.12.6(월)11:11수업,

package com.javaex.ex01;

public class Point {
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//메소드gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	메소드일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
}


/*
메소드일반에 addPoint p {주소가 들어오면 배열의 마지막에 Point를 넣는다}
get(index no) {배열의 index방 주소를 리턴해준다}
size() {현재 관리되고 있는 point개수를 리턴해준다}

PointList라는 클래스에서, 생성자: public PointList(){배열을 만들어준다} = this.pArray = new Point[3]
PointList라는 클래스에서, 메소드: public void add(Point p) {pArray[0] = p;} 아래 두 행의 수정 사항 때문에 pArray[0] = p;에서 pArray[crtPos] = p, crtPos++;
그런데 매번 채워지는 것 만큼 뒤로 물러나도록 하고 싶기 때문에 필드에 추가를 해주자
PointList라는 클래스에서, 필드: private int crtPos; (:add할 때 point가 들어갈 자리), 그래서 생성자에: this.crtPos = 0;
*/