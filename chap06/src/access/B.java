package access;

import accessModifier.AFieldMethod;

//어디에서든 접근 가 능
public class B {
	A a = new A() ; //객체생성하깅... A는 디폴트지만 같은 패키지 안이라 B에서 A호출 할 수 있음.
	public B() {
		
	
	AFieldMethod afm1 = new AFieldMethod();
	afm1.value1 = 10;
//	afm1.value2 = 20; ->패키지가 달라 사용 불가
//	afm1.value3 = 30; ->클래스를 벗어나서 사용 불가
	afm1.method1();

}
}