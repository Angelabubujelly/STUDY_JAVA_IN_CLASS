package overloading; //라이브러리는 메인 넣지 않 습 니 다.

public class Car {
	boolean power; //필드에 초값 안 넣으면 기본 초기값 FALSE들어가염.
	String company;
	int speed;
	public String model;
	
	//메서드...

		//3. 인자값이 있으면 그 스피드를 저장
	//4. 인자값이 없이 호출하면 스피드 1증가.
	//  오 버 로 딩 해 보 십 쇼...
	
	public Car(String model, String color, int i) {
		// TODO Auto-generated constructor stub
	}
	//1. 시동 걸기
	void power() {
		power = !power;
		if(power)
			System.out.println("시동을 켭니다.");
		else
			System.out.println("시동을 끕니다.");
	}
	//2. 현재 speed를 2개 만들기. 즉 메소드 2개 만들기 . 매개변수가 1개 있는 것과 없는 것 2개 만들기.	
//	void speed () {
//		speed++;
//	System.out.println("현재 속도는 : " + speed);
//	}
//	
//	void speed (int speed1) {
//		speed = speed1;
//		System.out.println("현재 속도는 : "+ speed);
//	}
//	
	int speed() {
		speed++;
		return speed; 
		//보이드와 다르게얜 리턴값이 있으니까 리턴 스피드 해주는겨
	}
	
	int speed(int speed1) {
		speed = speed1;
		return speed;
		}
	
	
}
