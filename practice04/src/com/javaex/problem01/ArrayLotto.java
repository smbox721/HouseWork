package com.javaex.problem01;
import java.util.ArrayList;

public class ArrayLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lotto = new ArrayList<>();
		
		while(true) {
			if(lotto.size() >= 6) {
				break;
			}
			Integer number = (int) ((Math.random()* 45)+1); //Boxing 
			if(!lotto.contains(number)) {
				lotto.add(number);
			}
		}
		System.out.println(lotto);
	
	}

}
