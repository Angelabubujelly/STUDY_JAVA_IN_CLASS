package polymorphism4;

public class Car {
	//필드
Tire frontLeftTire = new Tire("앞왼쪽",6); //어느때에 이걸 채워줘야하는거야아아아
Tire frontRightTire = new Tire("앞오른쪽",2);
Tire backLeftTire = new Tire("뒤왼쪽",4);
Tire backRightTire = new Tire("뒤오른쪽",3);
//생성자
//메소드
	int run() { //달리려면 roll호출해야함...
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1; //return 값에 1이 들어오면 펑크.. 걍 맘대로 준 것임
		} /*else if ㄴㄴ 다 따로 봐야하기때문에*/
		if(frontRightTire.roll()==false) {
			stop();
			return 2; //구냥 아무거나 수 부여
		}if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0; //0들어오면 또 if 돌리는거... 하...ㅡㅡ
	}

void stop() {
	System.out.println("[자동차가 멈춥니다.]");
}

}
