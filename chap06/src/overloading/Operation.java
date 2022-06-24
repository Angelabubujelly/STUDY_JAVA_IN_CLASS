package overloading;
//변수 = 속성, 저장공간이 있는 변수 1개.. 기능을하는 ㅇㅇ에게.. 입력값을주고.... 결과가 호출한 곳으로 값을 가지고오는게 메소드,,,메소드 옆은/
//반드시 괄호가 붙어...
 
public class Operation {
	int num1 = 1;//속성을 호출할때는 무조건 괄호 붙이진 않아염. 
	int num2 = 1;
	
	void plus() { //매개변수 x.. 메소드 호출할때는 무족건 괄호넣어야 함. 렝스할때도 괄호 안 붙였거덩. 렝쓰에 괄호 붙이묜 메소드 호출하는겨
		// 즉 괄호가 없으면 속성, 있으면 메소드임염
		System.out.println(num1 + num2); 
	}
	
	void plus (int x) { //매개변수 1개
		System.out.println(x + num2);
	}
	
	void plus (int x, int y) { //매개변수 2개
		System.out.println(x+y);
	}
	void plus (int x, String str) { //매개변수 2개
		System.out.println("메시지 : " + str +", 연산 :"  + (x+num2));
	
	//Math.random() //요녀석은 클래스이름.메서드(매개변수가 없는것...) ... Math.random(356) 356는 인자값임..
		// 매개변수가 1개인것과 인자값이 1개인걸 구분하구....
	
	}
}
