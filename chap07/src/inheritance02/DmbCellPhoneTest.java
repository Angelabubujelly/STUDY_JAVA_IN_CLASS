package inheritance02;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone dcp1 = new DmbCellPhone("������ S22","���",7);//��ü����
		
	System.out.println("�𵨸�: " +dcp1.model);
System.out.println("����: " +dcp1.color);
System.out.println("ä��: "+ dcp1.channel+"\n");

		dcp1.powerOn();
		dcp1.bell();
		dcp1.sendVoice("��������?");
		dcp1.receiveVoice("�� �����Դϴ�.");
		dcp1.sendVoice("������ ��� �ϰڽ��ϱ�?");
		dcp1.receiveVoice("���� �Ӱſ�");
		dcp1.sendVoice("�׷�");
		dcp1.hangUp();
		
		dcp1.thrnOnDmb();
		dcp1.changeChannelDmb(2);
		dcp1.turnOffDmb();
		System.out.println("��������������������������������������������������������������������������");
		
		Game game1 = new Game("������ 13","�ÿ�����","������ ����");
		
		System.out.println("�𵨸�: " +game1.model);
		System.out.println("����: " +game1.color);
		System.out.println("���� �̸�: "+ game1.gameKind+"\n");
		
		game1.choose("������ ���ڴ�");
		game1.start();
		game1.chat();
		game1.you("�ζ��ؿ�");
		game1.me("�׷���");
		game1.gameResult("��");
		game1.cut();
		game1.end();
		
		
	
	}

}
