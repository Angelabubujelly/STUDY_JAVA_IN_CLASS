package access;

import accessModifier.AFieldMethod;

//��𿡼��� ���� �� ��
public class B {
	A a = new A() ; //��ü�����ϱ�... A�� ����Ʈ���� ���� ��Ű�� ���̶� B���� Aȣ�� �� �� ����.
	public B() {
		
	
	AFieldMethod afm1 = new AFieldMethod();
	afm1.value1 = 10;
//	afm1.value2 = 20; ->��Ű���� �޶� ��� �Ұ�
//	afm1.value3 = 30; ->Ŭ������ ����� ��� �Ұ�
	afm1.method1();

}
}