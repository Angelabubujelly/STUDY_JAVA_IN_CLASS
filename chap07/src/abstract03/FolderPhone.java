package abstract03;

public class FolderPhone extends Phone {

//���� ��ӹ��� Phone������ constructor�� �����ڰ� ������ �ʿ�!
// super(owner);�ڵ�� Phone�� �����ڸ� ȣ���ؾ� ��~~!

	FolderPhone(String owner) {
		super(owner);
	}
	
//method
	void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
	void camera() {
		System.out.println("������ ������ ��´�.");
	}

	@Override
	void turnOn() {
		System.out.println(owner +"�� �ڵ����� ��� ��");
		
	}

	@Override
	void turnOff() {
		System.out.println(owner +"�� �ڵ����� �ݾƼ� ��");
			
	}
	
	
	
}
