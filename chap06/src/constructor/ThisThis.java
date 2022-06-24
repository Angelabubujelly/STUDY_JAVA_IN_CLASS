package constructor;

public class ThisThis {
	
String model;
String color;
int maxSpeed ;
int speed;

	ThisThis() {
	//this(다른 생성자 호출, 반드시 첫번째 줄에 입력
	 this("sm5","검정",200,10);
	System.out.println("Car ()생성자 호출");
	
}
	ThisThis(String model){
		this(model, "검정", 200,10);
    	System.out.println("Car(model)생성자 호출");	
		//this 안 붙이면 지역변수만 바꾸는거라 객체의 변수 내용을 바꾸지 않음...
    	
    }ThisThis(int maxSpeed){
    	this("sm5","검정",maxSpeed,10);
		System.out.println("Car(maxSpeed)생성자 호출");

	}
    ThisThis(String model, String color) {
		this(model,color,200,10);
	System.out.println("car (model, maxspeed) 생성자호출");
			}
    ThisThis(String model, String color, int maxSpeed, int speed){
		System.out.println("car (model, color, maxspeed)호출");
				
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;	
		this.speed = speed;
    }
	
}
