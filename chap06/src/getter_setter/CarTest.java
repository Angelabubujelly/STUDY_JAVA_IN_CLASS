package getter_setter;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();

		car1.setSpeed(-50); //메소드 뎃꾸왕!!!
//		car1.speed =70;  speed가 private이라 안됑
		System.out.println(car1.getSpeed());
//		System.out.println(car1.speed); privateㅇㅣ라..
		
		car1.setSpeed(555);
		System.out.println(car1.getSpeed());
//		if (!car1.isStop()) {
//			car1.setStop(true); //! 로 false를 true로..
//		}  이하 동문이삼...
			if (car1.isStop()) { //! 로 false를 true로..
				car1.setStop(false);
				
		} else {
			car1.setStop(true);
		}
		System.out.println("현재 속도 : " + car1.getSpeed());
	}

}
