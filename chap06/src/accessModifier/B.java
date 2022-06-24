package accessModifier;

public class B {
	A a1 = new A(true);
	A a3 = new A(5);
//	A a2 = new A("응"); <- String은 private이라 개체생성 불 가 
}
