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
		System.out.println("���� " + gameKind + "�� �����߽��ϴ�.");
	}
	
	void start() {
		System.out.println("������ �����մϴ�.");
	}
	void gameResult(String winner) {
		this.winner = winner;
		System.out.println("���� ��� " + this.winner + "�� �̰���ϴ�.");
	}
	void end() {
		System.out.println("������ �����մϴ�.");
	}
	void chat() {
		System.out.println("�޽����� �����߽��ϴ�.");
	}
	 void me(String message) {
		 System.out.println("��: " + message);
	 }
	 
	 void you(String message) {
		 System.out.println("��: " + message);
	 }
	 void cut() { System.out.println("ä���� �����մϴ�.");
	 }
	
	
}
