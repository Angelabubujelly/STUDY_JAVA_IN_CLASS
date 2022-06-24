package inheritance02;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone dcp1 = new DmbCellPhone("갤럭시 S22","노랑",7);//객체생성
		
	System.out.println("모델명: " +dcp1.model);
System.out.println("색상: " +dcp1.color);
System.out.println("채널: "+ dcp1.channel+"\n");

		dcp1.powerOn();
		dcp1.bell();
		dcp1.sendVoice("여보세요?");
		dcp1.receiveVoice("네 여보입니다.");
		dcp1.sendVoice("저녁은 어떻게 하겠습니까?");
		dcp1.receiveVoice("같이 머거용");
		dcp1.sendVoice("그려");
		dcp1.hangUp();
		
		dcp1.thrnOnDmb();
		dcp1.changeChannelDmb(2);
		dcp1.turnOffDmb();
		System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		
		Game game1 = new Game("아이폰 13","시에라블루","젤다의 전설");
		
		System.out.println("모델명: " +game1.model);
		System.out.println("색상: " +game1.color);
		System.out.println("게임 이름: "+ game1.gameKind+"\n");
		
		game1.choose("굴려라 왕자님");
		game1.start();
		game1.chat();
		game1.you("싸랑해용");
		game1.me("그래용");
		game1.gameResult("내");
		game1.cut();
		game1.end();
		
		
	
	}

}
