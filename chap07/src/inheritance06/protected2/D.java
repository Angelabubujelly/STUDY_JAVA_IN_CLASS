package inheritance06.protected2;

import inheritance06.protected1.A;

public class D extends A {
	
	public D () {
		super(); // �Ѱ��ִ°� �ƹ��͵� ���c~
		this.a = "����";
		this.methodA();
	}
}
