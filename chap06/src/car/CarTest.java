package car;
import accessModifier.A;
public class CarTest {

	public static void main(String[] args) {
		A a1 = new A(true);

		
		Car01 car1 = new Car01(null); //car��� ��ü �����ϱ�
		System.out.println("����ȸ�� : " + car1.company);
		System.out.println("�𵨸� : " +  car1.model);
		System.out.println("���� : " + car1.color);
		System.out.println("�ְ� �ӵ� : "+ car1.maxSpeed + "km/h");
		System.out.println("���� �ӵ� : "+ car1.speed + "km/h" + "\n");
		
		car1.company = "�츮 ���̴�";
		car1.model = "���Ѱɱ� ���Ѱɱ�";
		car1.speed = 299790;
		car1.color = "�����̶�� �� ��ġ";
		car1.maxSpeed = 28;
		
		System.out.println("����ȸ�� : " + car1.company);
		System.out.println("�𵨸� : " +  car1.model);
		System.out.println("���� : " + car1.color);
		System.out.println("�ְ� �ӵ� : "+ car1.maxSpeed + "km/h");
		System.out.println("���� �ӵ� : "+ car1.speed + "km/h");
		
		 car1.method1(); //ī��� ��ü�� �޼ҵ�1�� ȣ���մϴ�. ȣ���ϸ� �� ���� �����ϴ°ž�!!!!!!!!!!!!!
		 car1.method2(); 
		 
		 System.out.println(car1.method2()); //�ٷ� ����ϰų�
		 
		 int car1Me2 = car1.method2();
		 System.out.println(car1.method2()); //mothod2�� ��ȯ���� �����߱⶧����... int���� �����߱⶧���� ����ᵵ ��.
		 
		 car1.method3();
		 String name = car1.method3();
		 System.out.println(car1.method3());
		 System.out.println(name);
		 
		 
		 car1.method4();
		 System.out.println("\n" + car1.method4());
		 
		 System.out.println(	 car1.method5());
		 System.out.println(car1.method6());
		 /*���ݱ��� �� ���� �Ӽ��� ���� �� ���Դϴ�.
		
		Ŭ������ �� 2������ ���� ��.
		1. �Ӽ� 2. �޼ҵ�
		
		�Ӽ��� �ٷ� ������ �����ϴ°�. �Ӽ� Ȥ�� �ʵ��� ��.
		
		���̺귯���� �� �� �ִ� ��
		
		1.�Ӽ� 2. �޼ҵ�
		
		========================
		�޼ҵ�� ȣ�⿡�� ���� �� �� �ִ� �߰�ȣ ������ �Ǿ��ִ�. 
		�޼ҵ尡 �����ϴ� ��� Ÿ���� ���� ǥ���ϰ� �޼ҵ� �̸��� �����Ѵ�.
		�Ű������� ���� ������ �ְ� ������ ����... �� �����ڵ� �����ϰ� �������� �ٽ� ���ư���
		
		*/
		
		
		
		
	}

}
