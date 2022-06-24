package interface04;

public class SmartTv implements RemoteControl, Search{
 int volume ;
 int MIN_VOLUME =0;
int MAX_VOLUME=20; 
//내 것의 지역변수를 살펴보고
//그 다음 인스턴스 살펴보고 없으면
//그 다음 부모한테 가보고...
	@Override
	public void search(String url) {
	System.out.println(url + "을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
		
	}

	@Override
	public void setVolume(int Volume) {
		if(volume < MIN_VOLUME) {
			this.volume = 0;
		}else if(volume>MAX_VOLUME) {
			this.volume=20;
		}else {
			this.volume =volume;
		}
		System.out.println("현재 볼륨: " + this.volume);
	}

}
