package interface03;

public class ETest {

	public static void main(String[] args) {
		D d = new D();
		
		d.methodA();
		d.methodB();
		d.methodC();
		System.out.println();
		
		
		C c = new D();
		c.methodA();
		c.methodB();
		c.methodC();

	B b = new D();
	b.methodB(); //������ �����ִ� �͸� ��밡��
	
	A a = new D();
	a.methodA();

	}

}
