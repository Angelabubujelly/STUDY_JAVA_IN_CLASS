package overloading;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("제네시스", "흰색", 250);
		Car car2 = new Car("제네시스", "흰색", 250);
		
		System.out.println("car1 model :" + car2.model);
	}

}
