package interface05;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
	
		myCar.run(); //kumhoTire로 override된 내용이 출력됨..
		System.out.println("\n"+"♥♥♥♥♥♥♥♥♥♥"+"\n");
		myCar.backLeftTire = new HankookTire();
		myCar.frontLeftTire = new HankookTire();
		
		myCar.run();
		

	}

}
