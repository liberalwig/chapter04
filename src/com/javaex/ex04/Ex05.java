//2021.12.8(수)11:14수업: 05.Map

package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;

public class Ex05 {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(1,11);	//권상우
		Point p02 = new Point(2,22);	//정우성
		Point p03 = new Point(3,33);	//이효리

		pMap.put("권상우", p01);
		pMap.put("정우성", p02);
		pMap.put("이효리", p03);
		
		
	}

}
