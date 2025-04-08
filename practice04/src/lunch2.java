import java.util.Random;

public class lunch2 {
	public static void print () {
		
		String[] mate = {
			    "강승현", "권상윤", "권순빈", "김려명", "김성준", "김세빈", "김승연", "김영신", "김예진", "김지선", "김지원", "남현희", "도원규", "문정현", "박근정", "박신혜", 
			    "박예진", "사준기", "원정연", "유수종", "윤예슬", "이슬우", "장연우", "정시현", "정재훈", "조남윤", "조민진", "최지연", "한주형", "허성준", "홍효원"
			};
		
		Random rand = new Random();
		
		int [] nums = new int[4];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(31);
			for(int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) { 
	                nums[i] = rand.nextInt(31); 
	                j = -1; 
				}
			}
			System.out.print(mate[nums[i]]);
			if(i != 3) {
				System.out.print(" | ");
			}
		}//for문 종료
	}
}

