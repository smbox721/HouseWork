package ch05.sec10;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		int tot = 0;
		int avg = 0;
		int totalCount = 0;

		
		//전체 합과 평균을 출력하는 프로그램 완성
		for(int i = 0; i < array.length; i++) {
			totalCount += array[i].length;
			for(int j = 0; j < array[i].length; j++) {
				tot += array[i][j];
			}
		}

		System.out.println("최대값: " + tot);
		double avg2 = (double) tot / totalCount;
		System.out.println("평균: " + avg2);
		
	}
}

