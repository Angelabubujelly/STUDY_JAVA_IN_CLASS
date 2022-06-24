package inheritance;
//아 너무 재밌다 ^^*
//필드의 상속...
class AA {
	int valueA = 1;
	int valueAa = 10;
	
	void setValue(int x, int y) { //메소드생성!
		valueA = x;
		valueAa = y;
		System.out.println(valueA + "," + valueAa);
	}

}

class BB extends AA {
	int valueB;
	void sum() {
		valueB = valueA/*나한테 없으니까 부모한테 가서 확인하삼*/ + valueAa;
		System.out.println("합계: "+ valueB);
	}
} 

class CC extends AA {
	int valueC;
	void multi() {
		valueC = valueA*valueAa;
		System.out.println("곱셈:" + valueC);
	}
}

//부모의 값도 객체처럼 공유하는게 아니고 B의 부모인 A와 C의 부모인 A는 따로임. 공동으로 사용하고 싶으면 static을 붙여야 함!!!!!!!!

public class InheritanceTest2 {

	public static void main(String[] args) { //main 클래스가 올라옴...
		
		BB b1 = new BB(); //BB라는 클래스 정보가 올라옴,, 근데 상속받은 AA라는 클래스가 있어서 AA도 같이 올라옴...
						  //스택에 b1이라는 객체, 저장공간을 마련함.
						 // BB의 변수 valueB와 AA의 변수 valueA와 valueAa가 저장됨,... 클래스는 객체가 있어야만 사용할 수 있음..(?)
						 
						//자 이제 b1으ㅣ 메소드를 실행해볼게용
		b1.sum();		//b1이 가리키고 있는 BB에 sum을 감. 계산 뒤에 sum method가 말한 프린트가 나감.
		b1.setValue(100, 200); //b1이 가리키고 있는 BB에 없기에 AA로 감. 가서 setValue를 실행하면서 100,200을 넘겨줌...값을 저장함.
		b1.sum(); //b1이 가리키고 있는 BB로 가서 다시 계산을 함. 그리고 프린트 함.
		System.out.println();
		
		CC c1 = new CC();
		c1.multi();
		
	}

}
