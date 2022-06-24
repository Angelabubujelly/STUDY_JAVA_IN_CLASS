package constructor;

import constructor.Car;

public class CarTest2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("±×·£Àú");
		Car car3 = new Car(300);
		Car car4 = new Car("Á¦³×½Ã½º", "³ë¶û");
		Car car5 = new Car("K7", "»¡°­");
		Car car6 = new Car("SM7","Èò»ö",500);
		
		System.out.println("car1");
		System.out.println("car1 ¸ðµ¨: " + car1.model);
		System.out.println("car2 »ö»ó: " + car2.color);
		System.out.println("car3 ¼Óµµ: " + car3.maxSpeed);
		
	}

}
