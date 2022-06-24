package abstract03;

public abstract class Phone {
	//field
	String owner; //같은 클래스에서 쓸거니까 public 안 붙였엉~
	
	//constructor
	Phone(String owner) {
		this.owner =owner;
		
	}
	
	//method
	abstract void turnOn() ;
	abstract void turnOff()	;

}
