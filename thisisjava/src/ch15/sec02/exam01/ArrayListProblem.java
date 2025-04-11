package ch15.sec02.exam01;

import java.util.ArrayList;

public class ArrayListProblem {

	public static void main(String[] args) {
		// 빨 주 노 초 파 보  -> ArrayList 객체 만들고
		// 남 을 추가해서 전체 객체의 데이터를 출력하는 프로그램
		
		ArrayList list = new ArrayList();
		list.add("빨");
		list.add("주");
		list.add("노");
		list.add("초");
		list.add("파");
		list.add("보");
		System.out.println(list);
		
		list.add(5, "남");
		System.out.println(list);
	}

}
