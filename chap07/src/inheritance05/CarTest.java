package inheritance05;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();

		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation!= 0) {
				System.out.println(car.tires[problemLocation-1].location + "KumhoTire�� ��ü"); //������ ���� location..
				car.tires[problemLocation-1]=new KumhoTire(car.tires[problemLocation-1].location, 15); //��ü�����Ҷ� location �־ ���⳪Ÿ������.
			}
			System.out.println("��������������������������������������������������������������");
		}
		
	}

}
