package interface04;

public class RemoteControlTest {

	public static void main(String[] args) {
	SmartTv tv = new SmartTv();

	

	tv.turnOn();
	tv.setVolume(10);
	tv.search("거섬더처");
	tv.turnOff();
	System.out.println();
	
	RemoteControl rc = new SmartTv(); //rc.에 있는 3개만 사용 가넝
	rc.turnOn();
	rc.setVolume(2);
	rc.turnOff();
	
	
	Search sc = new SmartTv();
	sc.search("기심디치");
	
	}

}
