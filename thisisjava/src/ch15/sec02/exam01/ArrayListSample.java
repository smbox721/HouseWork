package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

public class ArrayListSample {
	public static void main(String[] args) {
		//타입설정 Integer 객체만 적재가능
		ArrayList<Integer> members = new ArrayList<>();
		//초기 용량(capacity) 지정
		ArrayList<Integer> num = new ArrayList<>(10);
		// 배열을 넣어 생성
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
		//다른 컬랙션으로부터 그대로 요소를 받아와 생성
		// (ArrayList)를 인자로 받는 API를 사용하기위해서 Collection 타입 변환이 필요할 떄 많이 사용
		ArrayList<Integer> list3 = new ArrayList<>(list2);
		
		ArrayList<String> list = new ArrayList<>(10); // 용량(capacity)를 10으로 설정
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		list.size(); // 크기(size)는 6 (들어있는 요소의 총 개수)
		System.out.println(list.size()); //리스트의 사이즈 출력
		System.out.println(list.get(3)); //3번째 D값 출력 
		
		ArrayList<String> list11 = new ArrayList<>();
		list11.add("1");
		list11.add("2");

		ArrayList<String> list22 = new ArrayList<>();
		list22.add("3");
		list22.add("4");

		list11.addAll(list22); // list1에 list2의 내용을 추가한다.
		 
		System.out.println(list11); // [1, 2, 3, 4]
		
		//리스트에 스트링타입 추가 하기 
		ArrayList<String> list5 = new ArrayList<>(8); 

		list5.add("1");
		list5.add("2");
		list5.add("3");
		list5.add("4");
		list5.add("5");

		// 3번째 인덱스 자리에 요소 삽입
		list5.add(3, "A");
		System.out.println(list5); // [1, 2, 3, A, 4, 5]
		list5.add(6, "B");
		System.out.println(list5);
		
		String result = list5.remove(3);
		System.out.println( "list5에서" + result + " 를 삭제 했습니다. 결과는 " + list5);
		
		//지정된 객체를 제거한다. 
		if(list5.remove("B")) { 
			System.out.println("list5에서 \"B\" 삭제 성공");
		}
		System.out.println(list5);
		
		
		ArrayList<String> list7 = new ArrayList<>(18); 

		list7.add("P");
		list7.add("r");
		list7.add("o");
		list7.add("g");
		list7.add("r");
		list7.add("a");
		list7.add("m");

		// list[0] ~ list[6] 범위 반환
		list7.subList(0, 7); // [P, r, o, g, r, a, m]
		// list[3] ~ list[6] 범위 반환
		list7.subList(3, 7); // [g, r, a, m]
		// list[3] ~ list[5] 범위 반환
		list7.subList(3, 6); // [g, r, a]
		
		list7.set(6, "n");
		System.out.println(list7);
		
		ArrayList<String> list8 = new ArrayList<>(10); // 용량(capacity)를 10으로 설정

		// 용량 10을 넘은 요소 13개 추가
		list8.add("A");
		list8.add("B");
		list8.add("C");
		list8.add("D");
		list8.add("E");
		list8.add("F");
		list8.add("G");
		list8.add("H");
		list8.add("I");
		list8.add("J");
		list8.add("K");
		list8.add("L");
		list8.add("M");

		list8.size(); // 크기(size)는 13 : 자동으로 용량이 증가되어 데이터를 적재함
		System.out.println(list8);
		
		//정렬 예제
		ArrayList list9 = new ArrayList();
		list9.add("3");
		list9.add("2");
		list9.add("1");
		//오름차순으로 정렬
		list9.sort(Comparator.naturalOrder());
		System.out.println(list9); // [1, 2, 3]
		
		Iterator iter = list9.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}
	}
}
