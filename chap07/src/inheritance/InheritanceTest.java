package inheritance;
//아 너무 재밌다 ^^*
//필드의 상속...
class A {
	int valueA = 1;
}
class B extends A {
	int valueB =2;
} 

class C extends A {
	int valueC = 3;
}

class D extends C	{
	int valueD = 4;
}

public class InheritanceTest {

	public static void main(String[] args) {
		A a1 = new A(); //A객체 생성..
		System.out.println(a1.valueA+"\n");
		// 사용불가 -> System.out.println(b1.valueB);
			
		B b1 = new B();
		System.out.println(b1.valueB);
		System.out.println(b1.valueA+"\n");//A를 상속받았기에...
		
		C c1 = new C();
		System.out.println(c1.valueC);
		System.out.println(c1.valueA+"\n");
		
		D d1 = new D();
		System.out.println(d1.valueD);
		System.out.println(d1.valueC);
		System.out.println(d1.valueA+"\n");
		
	}

}
