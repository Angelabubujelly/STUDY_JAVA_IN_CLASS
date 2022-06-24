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
		//car로 변환했기 떄문에 car에 들어있는 것만 사용가능.
		//따라서 water은 사용 불가
		
		HospitalCar hc = new HospitalCar();
		hc.drive();
		hc.argent();
		hc.stop();
		Car car1 = new HospitalCar();
		car1.drive();

	}

}
