package constructor;

public class Watch2 {
	String kind;
	String model;
	
	Watch2(){
	//this�� ������ �ٸ� ������ ȣ���̿�, �Ű������� 1��¥�� ȣ��,�Ű������� �ڷ����� String ���ڿ�
	// �ϳ�¥���� �Ѱ��ۿ������ϱ� �ٷ� String kind ������ ���°�.,..
	//�ٸ������� ȣ��, �Ű������� 2��¥�� ȣ��, �Ű������� �ڷ����� �� �� ���ڿ�	
		this("�ո�ð�", "ī�ÿ�");
	}
	Watch2(String kind) { //8�� kind���� ����;
	this(kind,"ī�ÿ�");
	}
	
	Watch2(String kind, String model) {
		this.kind = kind;
		this.model = model;
	}
	
}
