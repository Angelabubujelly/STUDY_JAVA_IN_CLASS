package staticEx;

public class Document {
	//1,2,3�� ����ƽ�� �پ����. �׷��� ��𼭵� 1,2,3�� ����.
	
	static int count; //�������1,2, ���..�ʱⰪ 0���� �����¡
	String name; //�����̸�
	
	Document() {
		this("�������" + ++count);
	}
	Document(String name){ //��� ����ڰ� ���� ������ name���� �־����
		this.name = name;
		System.out.println("���� " + this.name +"��(��) �����ƽ��ϴ�.");
	}

}
