package inheritanceFinal06;

class Car{
	//필드
	int speed;
	void speedUp() {
		speed += 1;
	}
	final void stop() {
		System.out.println("차를 멈춥니당꺅");
		speed = 0;
	}
}

class SportsCar extends Car {
	@Override
	void speedUp() {
		speed += 10;
		System.out.println("현재 속도 " + speed + "올렸습니다.");
}
//@Override
//final void stop() { <--------------------------------- 얘는 final 메소드라 오버라이딩 할 수 없음.
//	System.out.println("차를 완 존 히 멈 춥 니 다 만");
//	speed = 0;
//}

}
public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.speedUp();
		sc.stop();//오버라이딩만 못하지 호출은 된다궁~~
		
	}

}
