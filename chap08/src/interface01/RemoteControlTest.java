package interface01;

public class RemoteControlTest {

	public static void main(String[] args) {
		Tvv tv = new Tvv();
		Audio audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(5);
		tv.setVolume(11);
		tv.turnOff();
		System.out.println("������������������������������"+"\n");
		
		audio.turnOn();
		audio.setVolume(-50);
		audio.setVolume(111);
		audio.turnOff();
		
		
		System.out.println("������������������������������"+"\n");
		
		RemoteControl rc = tv;// �̰� ��ü������
		//RemoteControl rc = new Tvv(); �� �˴ϴ�!
		rc.turnOn();
		rc.turnOff();
		System.out.println("������������������������������"+"\n");
		
		rc = new Audio();
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery();
		
		

	}

}
