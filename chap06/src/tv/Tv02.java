package tv;

public class Tv02 {
	/*TV�� �Ӽ� : ����, �����󤼤�, ä��,����
	 *
	 * 
	 * */
	String color = "����	";//�� �� ������ null�̶� ���� �־�����/.
	boolean power; //(off�� �⺻����false)
	int channel; //�� �Է� ���Ϲ� 0�̴ϲ� �׳� ����...
	int volume; //�� �Է� ���ϸ� 0��...
	
	// �޼��� : ������ Ű�ų� ����, ä���� �ø��ų� ������ ��, ���� �����ų� �ø��� ��
	//void�� ȣ�⸸ �ϱ���,,,  ,,,��,.,,,
	void power () { //�ѹ� ȣ���Ҷ����� �ײ��Ǵ�..
		power = !power;
		if (power == true) {
			System.out.println("TV�� �׽��ϴ�.");
		} else 
			System.out.println("TV�� ���ϴ�.");
	}
	
	int channelUp () {
	channel ++;
	return channel;
	
	}
	void channelDown () {
		channel --;
		System.out.println("���� ä�� : " + channel);
	}
	
	void volUp() {
		volume++;
	System.out.println("���� ���� : " + volume);
	}
	
	int volDown() {
		volume--;
		System.out.println("���� ���� : " + volume);
	return volume;
	}
	
	void volume(int volume) {
		this.volume=volume;
		/*���������� Ŭ���� �̸��� ���� �� ���� ���Ҿ���.. 
		 * �׷��� this.���ΰ�.. �������� �̸��� vo1�̸� �� vol=vol1�� ��� ����*/
		
	}
}
