package inheritance02;

public class DmbCellPhone extends  CellPhone {
	//�ʵ�
	int channel;
	
	//������!
	DmbCellPhone(String model, String color, int channel){
//�ν��Ͻ� ������ �̸��� ���� �� �θ� �ִ� model�� �������� this.�� �ٿ�~
//���� ���� ������ �θ𿡵� �־ �켱������ �ڽ��� ������ �켱������ �װ� ������!
// �׷��� ������ �ֳ�~ ���� �θ� �ֳ�~ ���°�!
		
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�!
	void thrnOnDmb() {
		System.out.println("ä�� "+ channel + "�� ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel; //<= �ν��Ͻ� ������ �ٲ��ְ�...
		System.out.println( channel + "������ ä���� �ٲߴϴ�.");
}
	void turnOffDmb() {
		System.out.println("��� ������ ����ϴ�."+"\n");
	}
}