package ch11.sec05;

public class ThrowsExample1 {
	public static void main(String[] args) {
		try {
			findClass();
			return;
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}finally {
			System.out.println("종료 ");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}


