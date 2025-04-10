package com.javaex.problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFriend {
	public static void main(String[] srg) {
		System.out.println("친구 3명을 등록해 주세요.");
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Friend> fList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine(); // 한 줄 입력받기 (예: "정우성 010-2222-3333 초")
            String[] parts = input.split(" "); // 공백으로 분리

            // Friend 객체 생성 후 ArrayList에 추가
            String name = parts[0];
            String phone = parts[1];
            String school = parts[2];
            fList.add(new Friend(name, phone, school));
        }
//		fList.add(new Friend(name, phone, school));
//		fList.add(new Friend(name, phone, school));
//		fList.add(new Friend(name, phone, school));
		
		//System.out.println(fList);
		
		for (Friend friend : fList) {
            System.out.println("이름: " + friend.getName() + 
                               " 핸드폰: " + friend.getPhone() + 
                               " 학교: " + friend.getSchool());
        }

   
        // Scanner 닫기
        scanner.close();
		
	}
}
