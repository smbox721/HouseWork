package ch06.sec10.exam01;

public class Calculator {
	static double pi = 3.14159;
	
	int a = 10; //인스턴스 멤버이기떄문에 객체를 만들지 않으면안됨 or 스태틱선언으로 정적멤버 만들기 
	
	
	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
