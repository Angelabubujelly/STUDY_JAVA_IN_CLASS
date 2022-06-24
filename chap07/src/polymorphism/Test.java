package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
//		A a1 = b; //A객체로 b변환 가능
//		A a2 = c;
//		A a3 = d;
//		A a4 = e;
		
		B b1 = d; //D를 B객체로 변환 가능
		C c1 = e;
		
	}
}
