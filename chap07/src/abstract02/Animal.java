package abstract02;

public abstract class Animal {
	String kind;
	
	void breathe() {
		System.out.println("숨을 쉽니다.");
	//구현된 게 아무것도 없음!
	}
//추상 메소드가 하나라도 있으면 클래스 앞에 추상클래스임을 선언해야 함!
	abstract void sound();
}
