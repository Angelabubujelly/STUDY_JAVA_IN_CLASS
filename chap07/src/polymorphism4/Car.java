package polymorphism4;

public class Car {
	//�ʵ�
Tire frontLeftTire = new Tire("�տ���",6); //������� �̰� ä������ϴ°ž߾ƾƾ�
Tire frontRightTire = new Tire("�տ�����",2);
Tire backLeftTire = new Tire("�ڿ���",4);
Tire backRightTire = new Tire("�ڿ�����",3);
//������
//�޼ҵ�
	int run() { //�޸����� rollȣ���ؾ���...
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1; //return ���� 1�� ������ ��ũ.. �� ����� �� ����
		} /*else if ���� �� ���� �����ϱ⶧����*/
		if(frontRightTire.roll()==false) {
			stop();
			return 2; //���� �ƹ��ų� �� �ο�
		}if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0; //0������ �� if �����°�... ��...�Ѥ�
	}

void stop() {
	System.out.println("[�ڵ����� ����ϴ�.]");
}

}
