package tv;

public class Tv01 {
	/*TV�� �Ӽ� : ����, �����󤼤�, ä��,����
	 *
	 * 
	 * */
	String color = "����	";//�� �� ������ null�̶� ���� �־�����/.
	boolean power; //(off�� �⺻����false)
	int channel; //�� �Է� ���Ϲ� 0�̴ϲ� �׳� ����...
	int vol; //�� �Է� ���ϸ� 0��...
	
	// �޼��� : ������ Ű�ų� ����, ä���� �ø��ų� ������ ��, ���� �����ų� �ø��� ��
	//void�� ȣ�⸸ �ϱ���,,,  ,,,��,.,,,
	void power () { //�ѹ� ȣ���Ҷ����� �ײ��Ǵ�..
		power = !power;
	}
	
	void channelUp () {
	channel ++;
	
	}
	void channelDown () {
		channel --;
	}
	void volUp() {
		vol++;
	}
	void volDown() {
		vol--;
	}
}
