package interface02;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default method : 실행문을 넣을 수 있다.
	default void setMute(boolean mute) {
		System.out.println("나중에 추가된 메소드");
	if(mute) {
		System.out.println("무음 처리합니다.");
	} else
		System.out.println("무음 해제합니다.");
	}

	//static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
