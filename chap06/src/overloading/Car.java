package overloading; //���̺귯���� ���� ���� �� �� �� ��.

public class Car {
	boolean power; //�ʵ忡 �ʰ� �� ������ �⺻ �ʱⰪ FALSE����.
	String company;
	int speed;
	public String model;
	
	//�޼���...

		//3. ���ڰ��� ������ �� ���ǵ带 ����
	//4. ���ڰ��� ���� ȣ���ϸ� ���ǵ� 1����.
	//  �� �� �� �� �� �� �� ��...
	
	public Car(String model, String color, int i) {
		// TODO Auto-generated constructor stub
	}
	//1. �õ� �ɱ�
	void power() {
		power = !power;
		if(power)
			System.out.println("�õ��� �մϴ�.");
		else
			System.out.println("�õ��� ���ϴ�.");
	}
	//2. ���� speed�� 2�� �����. �� �޼ҵ� 2�� ����� . �Ű������� 1�� �ִ� �Ͱ� ���� �� 2�� �����.	
//	void speed () {
//		speed++;
//	System.out.println("���� �ӵ��� : " + speed);
//	}
//	
//	void speed (int speed1) {
//		speed = speed1;
//		System.out.println("���� �ӵ��� : "+ speed);
//	}
//	
	int speed() {
		speed++;
		return speed; 
		//���̵�� �ٸ��Ծ� ���ϰ��� �����ϱ� ���� ���ǵ� ���ִ°�
	}
	
	int speed(int speed1) {
		speed = speed1;
		return speed;
		}
	
	
}
