package interface05;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
	
		myCar.run(); //kumhoTire�� override�� ������ ��µ�..
		System.out.println("\n"+"��������������������"+"\n");
		myCar.backLeftTire = new HankookTire();
		myCar.frontLeftTire = new HankookTire();
		
		myCar.run();
		

	}

}
