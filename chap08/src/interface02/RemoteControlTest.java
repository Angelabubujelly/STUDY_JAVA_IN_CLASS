package interface02;

public class RemoteControlTest {

	public static void main(String[] args) {
		//모든 클래스는 익명객체로 만들 수 있댱~
	RemoteControl rc = new RemoteControl() {
		int volume = 0;
		@Override
		public void turnOn() {
			System.out.println("익명객체 Tv turnOn()");
		}

		@Override
		public void turnOff() {
			System.out.println("익명객체 Tv turnOff()");
			
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
			
				
				}	
	};
	rc.turnOn();
	RemoteControl rc2 =new Tv() {
		
	};
	}

}
