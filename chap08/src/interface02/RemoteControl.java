package interface02;

public interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default method : ���๮�� ���� �� �ִ�.
	default void setMute(boolean mute) {
		System.out.println("���߿� �߰��� �޼ҵ�");
	if(mute) {
		System.out.println("���� ó���մϴ�.");
	} else
		System.out.println("���� �����մϴ�.");
	}

	//static method
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
