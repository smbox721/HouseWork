import java.util.Random;

public class lunch {
	  public static void main(String[] args) {
		    // 이름 입력
		    String[] name = { "권상윤", "권순빈", "김려명", "김성준", "김세빈", "김승연", 
		        "김영식", "김예진", "김지선", "김지원", "남현희", "도원규", "문정현",
		        "박근정", "박신혜", "박예진", "사준기", "원정연", "유수종", "윤예슬", 
		        "이슬우", "장연우", "정시헌", "정재훈", "조남윤", "조민진", "최지원", 
		        "한주형", "허성준", "홍효원" };

		    int j[] = new int[30];
		    
		    // 0~29 횟수, 랜덤넘버 j
		    for (int i = 0; i < 30; i++) {
		      j[i] = (int) (Math.random() * 30) + 1;

		      for (int k = 0; k < i; k++) {
		        if (j[i] == j[k]) {
		          i--;
		          break;
		        }
		      }
		    }
		    for (int i = 1; i < 31; i++) {
		      //b
		      if (i%4 == 0) {
		        System.out.println(name[j[i-1]-1]+" ");
		        
		      }else {
		        System.out.print(name[j[i-1]-1]+",");
		      }
		      
		    }
}
}
