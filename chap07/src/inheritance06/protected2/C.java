package inheritance06.protected2;

import inheritance06.protected1.*; //.*하묜 패키지 내부의 모든 클래스가 와용~

public class C {
	public void methodC() {
		/*A a = new A();		
	생성자에 protected가 붙은 것은 다른 패키지에서 호출할 수 없다...*/
	B b = new B();
	b.methodB();
	
	}
}
