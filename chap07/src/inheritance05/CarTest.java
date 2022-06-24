package inheritance05;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();

		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation!= 0) {
				System.out.println(car.tires[problemLocation-1].location + "KumhoTire로 교체"); //방향을 위한 location..
				car.tires[problemLocation-1]=new KumhoTire(car.tires[problemLocation-1].location, 15); //객체생성할때 location 넣어서 방향나타내려궁.
			}
			System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		}
		
	}

}
