package abstract01;

public class SmartPhone extends Phone {

//���� ��ӹ��� Phone������ constructor�� �����ڰ� ������ �ʿ�!
// super(owner);�ڵ�� Phone�� �����ڸ� ȣ���ؾ� ��~~!

	SmartPhone(String owner) {
		super(owner);
	}
	
//method
	void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
	
}
