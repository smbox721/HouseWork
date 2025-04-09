package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = 0;
		
		try {
			result = data.length();
		}catch (Exception e) {
			result = -1;
			System.out.println(e.getMessage());
		}
		
		System.out.println("문자수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}


