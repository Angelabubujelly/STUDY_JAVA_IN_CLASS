package inheritanceSuper05;

class Parent {
	int x =10; //field �ϳ� ����

}


class Child extends Parent {
	int x = 200;
	
	void method() {
		int x = 3000;  //�ϰ͵� �� ������ ��������
		System.out.println("x=" + x);
	System.out.println("this.x="+this.x); //�� �ν��Ͻ� ������ ����Ͻÿ�
	System.out.println("super.x="+super.x);//�θ��� �ν��Ͻ����� ???? x�� ����Ͻÿ�?
	}
}



public class SuperTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.method();

	}

}
