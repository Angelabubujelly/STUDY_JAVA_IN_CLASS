package abstract02;

public abstract class Animal {
	String kind;
	
	void breathe() {
		System.out.println("���� ���ϴ�.");
	//������ �� �ƹ��͵� ����!
	}
//�߻� �޼ҵ尡 �ϳ��� ������ Ŭ���� �տ� �߻�Ŭ�������� �����ؾ� ��!
	abstract void sound();
}
