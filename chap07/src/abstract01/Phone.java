package abstract01;

public abstract class Phone {
	//field
	String owner; //같은 클래스에서 쓸거니까 public 안 붙였엉~
	
	//constructor
	Phone(String owner) {
		this.owner =owner;
		
	}
	
	//method
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff()	{
		System.out.println("폰 전원을 끕니다.");
	}
	

}
