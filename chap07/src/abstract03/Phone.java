package abstract03;

public abstract class Phone {
	//field
	String owner; //���� Ŭ�������� ���Ŵϱ� public �� �ٿ���~
	
	//constructor
	Phone(String owner) {
		this.owner =owner;
		
	}
	
	//method
	abstract void turnOn() ;
	abstract void turnOff()	;

}
