package inheritance06.protected2;

import inheritance06.protected1.*; //.*�Ϲ� ��Ű�� ������ ��� Ŭ������ �Ϳ�~

public class C {
	public void methodC() {
		/*A a = new A();		
	�����ڿ� protected�� ���� ���� �ٸ� ��Ű������ ȣ���� �� ����...*/
	B b = new B();
	b.methodB();
	
	}
}
