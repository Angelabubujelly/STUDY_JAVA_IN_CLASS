package interface02;

public class RemoteControlTest {

	public static void main(String[] args) {
		//��� Ŭ������ �͸�ü�� ���� �� �ֈ�~
	RemoteControl rc = new RemoteControl() {
		int volume = 0;
		@Override
		public void turnOn() {
			System.out.println("�͸�ü Tv turnOn()");
		}

		@Override
		public void turnOff() {
			System.out.println("�͸�ü Tv turnOff()");
			
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
			
				
				}	
	};
	rc.turnOn();
	RemoteControl rc2 =new Tv() {
		
	};
	}

}
