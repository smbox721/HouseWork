package friendarrayexample;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendArray {

	public static void main(String[] args) {
		ArrayList<FriendApp> fArrayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		//내용
		System.out.println("친구를 3명 등록해주세요.");
		for(int i = 0; i < 3; i++) {
			String temp = sc.nextLine();
			String[] tempArr = temp.split(" ");
			FriendApp f = new FriendApp(tempArr[0],tempArr[1],tempArr[2]);
			fArrayList.add(f);
		}
		
		for(FriendApp f : fArrayList) {
			System.out.println(f);
		}

	}

}
