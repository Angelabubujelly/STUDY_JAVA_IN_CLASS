package abstract02;

public class Dog extends Animal{

	// 추상클래스 안에서 정의되지 않은 메소드가 있으면 
	// 반드시 여기에서 정의해줘야 함! 
	// 필요 없어도 반드시 오버라이딩, 호출하고 비워두기라도 해야함.
	
	Dog() {
		//this.kind = "포유류"; this. 붙여두 되고 안 붙여도 되구.
		kind = "포유류";
	}
	
@Override
void sound() {
	
	System.out.println("멍멍");

	}

}
