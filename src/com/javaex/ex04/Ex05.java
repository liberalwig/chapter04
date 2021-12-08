//2021.12.8(수)11:14수업: 05.Map

package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(1, 11); // 권상우
		Point p02 = new Point(2, 22); // 정우성
		Point p03 = new Point(3, 33); // 이효리

		pMap.put("권상우", p01);
		pMap.put("정우성", p02);
		pMap.put("이효리", p03);
		/*
		 * pMap.put("권상우", p03); =>키(key) 위주로 수정되는 방식이라 권상우(3,33) 출력 같은 key가 오면 후에 나온
		 * key위주로 수정하는 방식. 정확한 선후관계는 알 수 없음.
		 */

		System.out.println(pMap.toString());

		/*
		 * System.out.println(pMap.get("정우성").getX()); //여기까지는 주소야
		 * System.out.println(pMap.size());
		 */

		// 키셋 구하기
		Set<String> keySet = pMap.keySet();
		
		for(String key:keySet) {
			System.out.println(pMap.get(key).getX());
		}
		
		//////////////////////
		Map<String, String> boardMap = new HashMap<String, String>();
		
		boardMap.put("title", "게시판 제목입니다.");
		boardMap.put("regDate", "2021-12-08");
		boardMap.put("content", "게시판 내용입니다.");
		
		System.out.println(boardMap.get("title"));
		
	}

}

//Map중 key로 꺼내는 건 대부분 String을 씀. Int쓰기도 하지만 대부분 이름 지을 때 String이니까
//번호를 매길 수 없으므로 for문이 아닌 향상된 for문을 적용