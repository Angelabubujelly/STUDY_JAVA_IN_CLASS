package polymorphism4;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		
		//i��ŭ for���� ���ƿ�~~~~~
		for(int i=1;i<=5; i++) {
			int problemLocation = car.run()	;
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� KumhoTire�� ��ü");
				//�θ�Ÿ�Կ� �ڽ� Ÿ���� ������... �׷��� ���� 1���� ���� �ȴ� �̰�..
				car.frontLeftTire = new KumhoTire("�տ���", 15);
				break;
				
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 15);
				break;
			
			case 3:
				System.out.println("�ڿ��� KumhoTire�� ��ü");
				car.backLeftTire = new KumhoTire("�ڿ���", 15);
				break;
				
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����", 15);
				break;
			}
			System.out.println("��������������������������������������������������������������"+"\n");
			
		}

	}

}
