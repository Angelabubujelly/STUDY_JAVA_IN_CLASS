package polymorphism4;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		
		//i만큼 for문이 돌아용~~~~~
		for(int i=1;i<=5; i++) {
			int problemLocation = car.run()	;
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 KumhoTire로 교체");
				//부모타입에 자식 타입을 넣은겨... 그러면 변수 1개만 있음 된다 이거..
				car.frontLeftTire = new KumhoTire("앞왼쪽", 15);
				break;
				
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 15);
				break;
			
			case 3:
				System.out.println("뒤왼쪽 KumhoTire로 교체");
				car.backLeftTire = new KumhoTire("뒤왼쪽", 15);
				break;
				
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 15);
				break;
			}
			System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥"+"\n");
			
		}

	}

}
