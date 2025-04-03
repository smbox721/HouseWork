package ch06.sec07.exam02;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자 선언
	public Korean(String n, String s) {
	  name = n;
	  ssn = s;
	  
	}

	public Korean() {
		name = "홍길동";
		ssn = "1111111-1111111";
	}
	public Korean(String n) {
		name = n;
	}
	public Korean(int s) {
		ssn = String.valueOf(s);
	}
}
