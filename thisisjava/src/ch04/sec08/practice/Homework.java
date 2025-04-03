package ch04.sec08.practice;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		//숫자 맞추기 게임 1 ~100
		
		Scanner sc = new Scanner(System.in);
		String inputNum = "";
		boolean cont = true; 
		
		System.out.println("-------------------------------");
		System.out.println("        [숫자 맞추기 게임]     ");
		System.out.println("-------------------------------");
		
		while(cont) {
			int random = (int) (Math.random() * 100) + 1;
			System.out.println(random);
			
			//게임 시작
			while(true) {
				System.out.println(">>");
				inputNum = sc.nextLine();
				
				if (random > Integer.parseInt(inputNum)) {
					System.out.println("더 높게");
				}else if (random < Integer.parseInt(inputNum)) {
					System.out.println("더 낮게");
				}else {
					System.out.println("맞았습니다.");
					break;
				}
			} // 게임 진행 종료
			
			System.out.println("게임을 종료 하시겠습니까? (y/n)");
			inputNum = sc.nextLine();
			if("y".equals(inputNum) || "Y".equals(inputNum)) {
				cont = false;
			}else {
				cont = true;
			}
			
			System.out.println("-------------------------------");
			System.out.println("        [숫자 맞추기 종료]     ");
			System.out.println("-------------------------------");
		}
	
	}
}