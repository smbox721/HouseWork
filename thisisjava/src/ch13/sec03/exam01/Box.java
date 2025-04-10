package ch13.sec03.exam01;

public class Box<T> {
	// 필드
	private T t; //래퍼 클래스는 null이 기본값

	// Getter 메소드
	public T get() {
		return t;
	}

	// Setter 메소드
	public void set(T t) {
		this.t = t;
	}
}
