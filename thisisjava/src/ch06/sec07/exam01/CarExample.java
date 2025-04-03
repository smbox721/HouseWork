package ch06.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250);
		//Car myCar = new Car();  //기본 생성자 호출 못함
		Car myCar2 = new Car("소나타", "검정", 300);
		Car myCar3 = new Car("소나타", 300, "초록");
		Car mtCar4 = new Car();
		
	}
}

