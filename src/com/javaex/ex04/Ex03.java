/*2021.12.7(화)13:50수업, 04.Set중 Hash-set를 이용하여 로또 만들기

[문제]
1~45 까지의 숫자중 임의의 6개의 숫자를 출력하세요(HashSet을 사용하여 중복제거)

*/

package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		//HashSet을 이용해서 로또 자동생성기 제작: + 랜덤 함수
		
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		
		while(true) {// 탈출조건: 6개면 탈출
			if(iSet.size()>=6) {
				break;
			}
			int num = (int)(Math.random()*45)+1;
			System.out.println("생성된 숫자: " + num);
			iSet.add(num); //중복체크는 Set으로 해결
		}
		
		System.out.println("========================");
		for(int no: iSet) {//언박싱
			System.out.println(no);
		}
		
		
		
	}
}
