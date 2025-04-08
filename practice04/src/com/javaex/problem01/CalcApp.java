package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // 객체 생성
        Add add = new Add();
        Div div = new Div();
        Mul mul = new Mul();
        Sub sub = new Sub();

        boolean run = true;


        // 계산기 실행
        while (run) {
            // 사용자 입력 받기
            System.out.print(">> ");
            String input = scanner.nextLine();

            // 종료 조건 확인
            if (input.equals("/q")) {
                System.out.println("종료합니다.");
                break;
            }

            // 입력 파싱 (숫자와 연산자 분리)
            String[] parts = input.split(" ");
            if (parts.length != 3) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            // 숫자와 연산자 추출
            int a;
            int b;
            try {
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 숫자 형식입니다.");
                continue;
            }
            
            String operator = parts[1];

            // 연산 수행
            if (operator.equals("+")) {
                add.setValue(a, b);
                int result = add.calculate(); // 정수형 결과
                System.out.println(result);
            } else if (operator.equals("-")) {
                sub.setValue(a, b);
                int result = sub.calculate(); // 정수형 결과
                System.out.println(result);
            } else if (operator.equals("*")) {
                mul.setValue(a, b);
                int result = mul.calculate(); // 정수형 결과
                System.out.println(result);
            } else if (operator.equals("/")) {
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    continue;
                }
                div.setValue(a, b);
                double result = div.calculate(); // 실수형 결과
                System.out.println(result); // 소수점 포함 출력
            } else {
                System.out.println("알 수 없는 연산입니다.");
                continue;
            }
        }

        scanner.close();
    }

}
