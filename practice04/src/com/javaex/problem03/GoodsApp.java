package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import friendarrayexample.FriendApp;

public class GoodsApp {

  

	public static void main(String[] args) {
    	ArrayList<Goods> gArrayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		//내용
		System.out.println("상품 3개를 입력해주세요.");
		for(int i = 0; i < 3; i++) {
			String temp = sc.nextLine();
			String[] tempArr = temp.split(" ");
			Goods g = new Goods(tempArr[0],Integer.parseInt(tempArr[1]),Integer.parseInt(tempArr[2]));
			gArrayList.add(g);
			
			sum += Integer.parseInt(tempArr[2]);
			
		}
		for(Goods g : gArrayList) {
			System.out.println(g);
		}
		//총 합 출력
		System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
    }

}
