package inheritanceFinal06;

class Car{
	//�ʵ�
	int speed;
	void speedUp() {
		speed += 1;
	}
	final void stop() {
		System.out.println("���� ����ϴ粦");
		speed = 0;
	}
}

class SportsCar extends Car {
	@Override
	void speedUp() {
		speed += 10;
		System.out.println("���� �ӵ� " + speed + "�÷Ƚ��ϴ�.");
}
//@Override
//final void stop() { <--------------------------------- ��� final �޼ҵ�� �������̵� �� �� ����.
//	System.out.println("���� �� �� �� �� �� �� �� ��");
//	speed = 0;
//}

}
public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		sc.speedUp();
		sc.stop();//�������̵��� ������ ȣ���� �ȴٱ�~~
		
	}

}
