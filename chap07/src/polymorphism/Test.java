package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
//		A a1 = b; //A��ü�� b��ȯ ����
//		A a2 = c;
//		A a3 = d;
//		A a4 = e;
		
		B b1 = d; //D�� B��ü�� ��ȯ ����
		C c1 = e;
		
	}
}
