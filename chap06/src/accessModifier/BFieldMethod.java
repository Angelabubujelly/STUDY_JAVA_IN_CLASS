package accessModifier;

public class BFieldMethod {
	public BFieldMethod() {
		AFieldMethod a = new AFieldMethod();
		a.value1 = 10;
		a.value2 = 10; //default�� value2�� ��� ����
//		a.value3 = 20; -> private���Ӷ� ���� �Ұ���
		
		a.method1();
		a.method2();
//		a.method3();  -> private���Ӷ� ���� �Ұ���
	}
}
