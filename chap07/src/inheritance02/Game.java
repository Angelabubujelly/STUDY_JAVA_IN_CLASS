package inheritance02;

public class Game extends CellPhone  {

	String winner;
	String gameKind;
	
	Game(String model, String color, String gameKind){
		this.model = model;
		this.color = color;
		this.gameKind = gameKind;
	}

	
	void choose(String gameKind) {
		this.gameKind = gameKind;
		System.out.println("게임 " + gameKind + "를 선택했습니다.");
	}
	
	void start() {
		System.out.println("게임을 실행합니다.");
	}
	void gameResult(String winner) {
		this.winner = winner;
		System.out.println("게임 결과 " + this.winner + "가 이겼습니다.");
	}
	void end() {
		System.out.println("게임을 종료합니다.");
	}
	void chat() {
		System.out.println("메시지가 도착했습니다.");
	}
	 void me(String message) {
		 System.out.println("나: " + message);
	 }
	 
	 void you(String message) {
		 System.out.println("소: " + message);
	 }
	 void cut() { System.out.println("채팅을 종료합니다.");
	 }
	
	
}
