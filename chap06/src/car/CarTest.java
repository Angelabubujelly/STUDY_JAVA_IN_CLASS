package car;
import accessModifier.A;
public class CarTest {

	public static void main(String[] args) {
		A a1 = new A(true);

		
		Car01 car1 = new Car01(null); //car라는 객체 생성하기
		System.out.println("제작회사 : " + car1.company);
		System.out.println("모델명 : " +  car1.model);
		System.out.println("색상 : " + car1.color);
		System.out.println("최고 속도 : "+ car1.maxSpeed + "km/h");
		System.out.println("현재 속도 : "+ car1.speed + "km/h" + "\n");
		
		car1.company = "우리 사이는";
		car1.model = "변한걸까 편한걸까";
		car1.speed = 299790;
		car1.color = "설렘이라는 건 마치";
		car1.maxSpeed = 28;
		
		System.out.println("제작회사 : " + car1.company);
		System.out.println("모델명 : " +  car1.model);
		System.out.println("색상 : " + car1.color);
		System.out.println("최고 속도 : "+ car1.maxSpeed + "km/h");
		System.out.println("현재 속도 : "+ car1.speed + "km/h");
		
		 car1.method1(); //카라는 객체에 메소드1을 호출합니당. 호출하면 이 값을 저장하는거야!!!!!!!!!!!!!
		 car1.method2(); 
		 
		 System.out.println(car1.method2()); //바로 출력하거나
		 
		 int car1Me2 = car1.method2();
		 System.out.println(car1.method2()); //mothod2는 반환값을 설정했기때문에... int형을 선언했기때문에 출력햐도 됨.
		 
		 car1.method3();
		 String name = car1.method3();
		 System.out.println(car1.method3());
		 System.out.println(name);
		 
		 
		 car1.method4();
		 System.out.println("\n" + car1.method4());
		 
		 System.out.println(	 car1.method5());
		 System.out.println(car1.method6());
		 /*지금까지 한 것은 속성에 대해 한 것입니다.
		
		클래스는 딱 2가지로 구성 됨.
		1. 속성 2. 메소드
		
		속성은 바로 변수를 선언하는것. 속성 혹은 필드라고 함.
		
		라이브러리에 들어갈 수 있는 건
		
		1.속성 2. 메소드
		
		========================
		메소드란 호출에서 실행 할 수 있는 중괄호 블럭으로 되어있다. 
		메소드가 리턴하는 결과 타입을 먼저 표시하고 메소드 이름을 선언한다.
		매개변수는 값이 있으면 넣고 없으면 ㅃ구... 머 실행코드 실행하고 리턴으로 다시 돌아가연
		
		*/
		
		
		
		
	}

}
