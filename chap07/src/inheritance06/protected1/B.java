package inheritance06.protected1;

public class B {
	public void methodB () {
		A a = new A(); //같은 패키지 속의 A 객체 생성 해보겠읍니당.
		a.a = "HTML";
		a.methodA();
	}
}
