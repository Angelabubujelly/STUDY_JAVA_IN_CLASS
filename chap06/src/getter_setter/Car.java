package getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	
	int getSpeed() { //�޼ҵ�.. ��ȯ���� int...
		return speed; //speed�� ���� �������� ����...
	}
	void setSpeed(int speed) { 
			if(speed < 0) {
				this.speed= 0;
				return; //���� �� �ƹ��͵� �� ������ ��ȯ�� x
					    //�� �����ÿ�... ȣ���� ������ �ǵ��ư���.. �� ���·�
			} else
				this.speed= speed;
	}
	boolean isStop() {
		return stop;
	}
	boolean getStop() {
		return stop;
	}
	void setStop(boolean stop) {
		this.stop = stop;
		speed = 0;
	}
}
