package ch05.sec10;

public class ex7 {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int max = 0;
		
		for(int temp : array) {
			if(temp > max) {
				max = temp;
			}
		}
		System.out.println(max);
	}
}
