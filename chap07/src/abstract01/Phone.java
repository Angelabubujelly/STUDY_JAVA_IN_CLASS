package abstract01;

public abstract class Phone {
	//field
	String owner; //���� Ŭ�������� ���Ŵϱ� public �� �ٿ���~
	
	//constructor
	Phone(String owner) {
		this.owner =owner;
		
	}
	
	//method
	void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	void turnOff()	{
		System.out.println("�� ������ ���ϴ�.");
	}
	

}
