package abstract02;

public class Dog extends Animal{

	// �߻�Ŭ���� �ȿ��� ���ǵ��� ���� �޼ҵ尡 ������ 
	// �ݵ�� ���⿡�� ��������� ��! 
	// �ʿ� ��� �ݵ�� �������̵�, ȣ���ϰ� ����α�� �ؾ���.
	
	Dog() {
		//this.kind = "������"; this. �ٿ��� �ǰ� �� �ٿ��� �Ǳ�.
		kind = "������";
	}
	
@Override
void sound() {
	
	System.out.println("�۸�");

	}

}
