package interface01;

public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
	if(volume < MIN_VOLUME	) {
		this.volume = 0;
	} else if(volume > MAX_VOLUME) {
		this.volume = 10;
	}else {
		this.volume = volume;
	}
	System.out.println("현재 Audio볼륨 : "+ this.volume);
	//얜 this.volume해주는 이유가... 음..넹
	
	}
	public void setMute(boolean mute) {
	if(mute) {
		System.out.println("Audio 무음 처리합니다.");
	} else
		System.out.println("Audio 무음 해제합니다.");
}
}
