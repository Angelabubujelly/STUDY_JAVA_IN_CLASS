package normal;
class Elec {
	
}
class Tv extends Elec{
	
}

class Computer extends Elec {
	
}

class Audio extends Elec{
	
}

public class NormalTest01 {

	public static void main(String[] args) {
		
//		Tv tv = new Tv(); //객체는 Tv객체와 부모인 Elec개체  2개가 생성이 됨. 상속 받았으니까!
//		Computer com = new Computer();
//		
//		 //자식타입을 부모타입으로 넣는다.. 모두 받을 수 있다.. 편하다...
//		Elec elec1 =tv; //부모타입으로 형변환 할때는 자동 형변환됨
//		Elec elec2 = com; 
//		Elec elec3 = new Audio();
//		Elec elec4 = new Elec(); // Elect 객체만 생성되어있고 자식은 객체가 생성되어 있지 않음...
//		
//		 //부모타입이 자식타입으로 형변환 하려면 강제형변환
//		//조건1. 반드시 처음에 자식타입으로 객체가 생성되어 있어야 합니다. 처음부터 elec되어있으면 ㄴㄴ
//		//앞에 (Tv)붙여서 casting 해줘야함..
//		Tv tv1 = (Tv)elec1;
//	//	Tv tv2 = (Tv)elec4; tv객체가 없기때문에 처음부터 부모객체만 만들어진 경우 강제 형변환 안 됨
//		Audio audio1 = (Audio)elec3; //부모타입을 자식타입으로 형변환해줘야 함 땅땅땅
//
//		
//		Computer com2 = (Computer)elec3;
//		Elec elec4 = new Elec(); //부모타입을 부모타입에 넣고...
		
		////////////////////////////////////////////////////////////////////////
		
		Tv tv = new Tv(); //객체는 Tv객체와 부모인 Elec개체  2개가 생성이 됨. 상속 받았으니까!
		Elec elec1 =tv; //부모타입으로 형변환 할때는 자동 형변환됨
		Tv tv1 = (Tv)elec1;
	
		Elec elec2 = new Elec();
		
		Tv tv2 = (Tv)elec2; //run 누르면 Exception 일어남

		

	}

}
