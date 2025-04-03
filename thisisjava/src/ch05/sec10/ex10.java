package ch05.sec10;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3의 배수의 개수와 그 합을 아래와 같이 출력하세요.
		int[] data = {1,3,5,7,9,11,15,19,18,20,30,33,31};
		
		//주어진 배열에서 3의 배수의 개수 =?
		//주어진 배열에서 3의 합 =?
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] % 3 == 0) {
				sum += data[i];
				count++;
			}
		}
		
		System.out.println("3의 배수의 개수: " + count);
		System.out.println("3의 배수의 합: " + sum);
		}
	}

