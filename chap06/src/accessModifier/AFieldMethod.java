package accessModifier;

public class AFieldMethod {
	public 	int value1; //��𿡼��� ���� ����
	int value2; //���� ��Ű�� �ȿ����� ��� ����
	private int	value3; //���� Ŭ���� �ȿ����� ��� ����

	public AFieldMethod() {
		value1 = 1;
		value2 = 1;
		value3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
}
