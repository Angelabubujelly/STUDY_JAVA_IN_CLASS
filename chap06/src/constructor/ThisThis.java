package constructor;

public class ThisThis {
	
String model;
String color;
int maxSpeed ;
int speed;

	ThisThis() {
	//this(�ٸ� ������ ȣ��, �ݵ�� ù��° �ٿ� �Է�
	 this("sm5","����",200,10);
	System.out.println("Car ()������ ȣ��");
	
}
	ThisThis(String model){
		this(model, "����", 200,10);
    	System.out.println("Car(model)������ ȣ��");	
		//this �� ���̸� ���������� �ٲٴ°Ŷ� ��ü�� ���� ������ �ٲ��� ����...
    	
    }ThisThis(int maxSpeed){
    	this("sm5","����",maxSpeed,10);
		System.out.println("Car(maxSpeed)������ ȣ��");

	}
    ThisThis(String model, String color) {
		this(model,color,200,10);
	System.out.println("car (model, maxspeed) ������ȣ��");
			}
    ThisThis(String model, String color, int maxSpeed, int speed){
		System.out.println("car (model, color, maxspeed)ȣ��");
				
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;	
		this.speed = speed;
    }
	
}
