package polymorphism3;


public class CarTest {

	public static void main(String[] args) {
	
		FireCar fc = new FireCar();
		
		fc.drive();
		fc.water();
		fc.stop();
		
		Car car = new FireCar();
		System.out.println("\n");
		car.drive(); 
	
		System.out.println("\n");
		//car�� ��ȯ�߱� ������ car�� ����ִ� �͸� ��밡��.
		//���� water�� ��� �Ұ�
		
		HospitalCar hc = new HospitalCar();
		hc.drive();
		hc.argent();
		hc.stop();
		Car car1 = new HospitalCar();
		car1.drive();

	}

}
