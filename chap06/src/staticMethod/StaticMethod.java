package staticMethod;

public class StaticMethod {
	//인스턴스 변수-> 클래스 메소드에서는 사용 불가능
	int x = 10;
	int y = 20;
	
	//클래스 메서드에서는 클래스변수만 사용할 수 있음.
	//클래스 변수는 클래스,인스턴스 메서드 모두 사용 가능
	static int i= 10;
	static int j= 20;
	
	//클래스 메서드 -> 객체를 생성하지 않고도 사용 가능. 스태틱이 안 붙은건 반드시 객체를 생성해야만 사용할 수 있음,

	static int add(int x, int y) {
		return i+j;
	}
	static int subtract(int x, int y) {
		return x-y;
	}
	static int multiply(int x, int y) {
		return x*y;
	}
	//인스턴스 메서드 -> 반드시 객체를 생성해야만 사용가능
	int addIns(int x1, int y1) {
		int result = i+j; //객체생성 하든 안 하든 사용 가능!!
		//클래스이름.i이든..
		return x + y; //인스턴스 변수으ㅣ x와 y로...
	}
	int subtractIns(int x, int y) {
		return x-y;
	}
	int multiplyIns(int x, int y) {
		return x*y;
	}
}

//어쨌든 둘 다 쓸 땐 스택에 올라온..ㄷ...ㅏ...