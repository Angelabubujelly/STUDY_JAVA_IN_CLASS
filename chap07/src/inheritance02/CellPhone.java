package inheritance02;

public class CellPhone {
	
	String model; //�ʵ尡 2��~
	String color; 
	
	void powerOn() { //��ȯ�� ���� �޼ҵ� 2��~
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	void bell() {
		System.out.println("���� �︳�ϴ�."+"\n");
	}
	void sendVoice(String message) { // �Ű����� �ϳ� ������~
		System.out.println("��: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("����: "  + message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�."+"\n");
	}
}
