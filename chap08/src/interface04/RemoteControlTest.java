package interface04;

public class RemoteControlTest {

	public static void main(String[] args) {
	SmartTv tv = new SmartTv();

	

	tv.turnOn();
	tv.setVolume(10);
	tv.search("�ż���ó");
	tv.turnOff();
	System.out.println();
	
	RemoteControl rc = new SmartTv(); //rc.�� �ִ� 3���� ��� ����
	rc.turnOn();
	rc.setVolume(2);
	rc.turnOff();
	
	
	Search sc = new SmartTv();
	sc.search("��ɵ�ġ");
	
	}

}
