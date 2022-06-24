package interface01;

public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
		
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
	System.out.println("���� Audio���� : "+ this.volume);
	//�� this.volume���ִ� ������... ��..��
	
	}
	public void setMute(boolean mute) {
	if(mute) {
		System.out.println("Audio ���� ó���մϴ�.");
	} else
		System.out.println("Audio ���� �����մϴ�.");
}
}
