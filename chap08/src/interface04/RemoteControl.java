package interface04;

public interface RemoteControl {
//상수만 가능!
	int MAX_VOLUME =20;
	int MIN_VOLUME=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
	void search(String url);
}
