package inheritanceOver04;

public class Z extends X {
	int z = 30;
	
	@Override
	void setXY (int x, int y) {
		this.x = x; //�̰� �ٿ����.. �������̵� �ż� �긦 ȣ���ѰŰŵ�..
		this.y = y; //�̰� �ٿ����.. 
		
		System.out.println("��ǥ : (" + this.x + ", " + this.y + ", " + z + ")" ); //z�� �����ؼ� this ��������..
	}
}
