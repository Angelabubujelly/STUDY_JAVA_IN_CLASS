package polymorphism7;

 class Parent {
	String field1;
	
	void method1() {
		System.out.println("Parent-method1()");
	}
	void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent{
	String field2;
	
	void method3() {
		System.out.println("Parent-method2()");
	}
	
}

public class ChildTest {
	public static void main (String []	args	) {
		Child child = new Child();
		//�ڽİ�ü�� ����� �θ� ��ü������ �������. ���� ���� �θ�Ÿ�Ը� ����ϵ���~!
		Parent parent = new Child();
		// �θ�Ÿ������ ����ȯ �߱� ������ �θ� �ִ� �ʵ�� �޼ҵ常 ��밡��
		parent.field1 = "�θ�";
		parent.method1(); 
		child.method3();
		
		//ó������ �θ�� ��ü�� �����߱� ������ �ڽİ�ü�� �ƿ� ����������� �� �� �� �� �� ��? ���� ���ϴٸ�.
//		Child child3 = new Parent(); �� �θ� �ڽ����� �ٷ� ��ȯ �� �� ����
		
//		Parent p = new Parent();
//		Child child3 = (Child)p;
		
		//ó�� ��ü�� �ڽİ�ü�� ���� �θ�ü�� ����ϴٰ� �ڽ� ��ü�� ����ϵ��� ����
		Child child2 = (Child)parent;
		child2.field1 = "�θ��ʵ�";
		child2.field2 = "�ڽ��ʵ�";
		child2.method1(); // "�θ� �޼ҵ�"  �� �̰��� �ٷ� ���� ����ȯ "Casting"
		child2.method3();//  "�ڽĸ޼ҵ�"
		
		Parent parentA = new Child();
		if(parentA instanceof Child) {
			Child child4 = (Child)parentA;
			System.out.println("casting ��ȯ ���� ��-");
		} else {
			System.out.println("casting �� �� ������0��");
		}
		
		Parent parentB = new Parent();
//		Child child4 = (Child)parentB;
		if (parentB instanceof Child) {
			Child child5 = (Child)parentB;
			System.out.println("casting ��ȯ ���� -.,-");
		}else {
			System.out.println("casting �� �� ���� >��<~��");
		}
	}
	
}