package inheritance02;

public class CellPhone {
	
	String model; //필드가 2개~
	String color; 
	
	void powerOn() { //반환형 없는 메소드 2개~
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다."+"\n");
	}
	void sendVoice(String message) { // 매개변수 하나 받을게~
		System.out.println("나: " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: "  + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다."+"\n");
	}
}
