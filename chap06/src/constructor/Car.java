package constructor;

public class Car {
	//�Ӽ�
	String model = "sm5";
	String color = "����";
	int maxSpeed = 200;
	int speed;
	//������ : Ŭ�����̸��� ���� �̸�, ��ȯ���� ����.
	//������ �ٸ��ų� ������ ������ ���� �Ȥ��ƾ���..
	Car() {
		System.out.println("Car ()������ ȣ��");
		model = "SM5";
		color = "����";
		maxSpeed = 200;
	}
	Car(String model){
	System.out.println("Car(model)������ ȣ��");	
	//this �� ���̸� ���������� �ٲٴ°Ŷ� ��ü�� ���� ������ �ٲ��� ����...
	this.model = model;
	}
	Car(int maxSpeed){
		System.out.println("Car(maxSpeed)������ ȣ��");
	this.maxSpeed = maxSpeed;
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
			}
	Car(String model, String color, int speed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
