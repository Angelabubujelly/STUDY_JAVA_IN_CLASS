package interface04;

public class SmartTv implements RemoteControl, Search{
 int volume ;
 int MIN_VOLUME =0;
int MAX_VOLUME=20; 
//�� ���� ���������� ���캸��
//�� ���� �ν��Ͻ� ���캸�� ������
//�� ���� �θ����� ������...
	@Override
	public void search(String url) {
	System.out.println(url + "�� �˻��մϴ�.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
		
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
		System.out.println("���� ����: " + this.volume);
	}

}
