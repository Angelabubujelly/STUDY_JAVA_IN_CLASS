package interface01;

public class Tvv implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("���� TV���� : "+ this.volume);
		
	}

}
