package constructor;

import constructor.Car;

public class CarTest2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("�׷���");
		Car car3 = new Car(300);
		Car car4 = new Car("���׽ý�", "���");
		Car car5 = new Car("K7", "����");
		Car car6 = new Car("SM7","���",500);
		
		System.out.println("car1");
		System.out.println("car1 ��: " + car1.model);
		System.out.println("car2 ����: " + car2.color);
		System.out.println("car3 �ӵ�: " + car3.maxSpeed);
		
	}

}
