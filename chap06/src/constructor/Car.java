package constructor;

public class Car {
	//속성
	String model = "sm5";
	String color = "검정";
	int maxSpeed = 200;
	int speed;
	//생성자 : 클래스이름과 동일 이름, 반환형이 없다.
	//개수가 다르거나 변수의 종류가 같지 안ㅎ아야함..
	Car() {
		System.out.println("Car ()생성자 호출");
		model = "SM5";
		color = "검정";
		maxSpeed = 200;
	}
	Car(String model){
	System.out.println("Car(model)생성자 호출");	
	//this 안 붙이면 지역변수만 바꾸는거라 객체의 변수 내용을 바꾸지 않음...
	this.model = model;
	}
	Car(int maxSpeed){
		System.out.println("Car(maxSpeed)생성자 호출");
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
