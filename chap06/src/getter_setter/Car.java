package getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	
	int getSpeed() { //메소드.. 반환형이 int...
		return speed; //speed의 값을 데려오는 것임...
	}
	void setSpeed(int speed) { 
			if(speed < 0) {
				this.speed= 0;
				return; //리턴 후 아무것도 안 넣으면 반환형 x
					    //걍 끝내시오... 호출한 곳으로 되돌아가오.. 빈 상태로
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
