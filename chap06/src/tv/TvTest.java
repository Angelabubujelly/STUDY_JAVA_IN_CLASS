package tv;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv02 tv1 = new Tv02();
		tv1.power(); //power�� ������ �ǹ�, power()�޼ҵ� �ǹ�!! �� �޼ҵ� �θ�����
	System.out.println("tv ���� : " + tv1.power); //�� �Ŀ����� �Ӽ��� ���..

		tv1.channelUp();
		tv1.channelUp();
	System.out.println(tv1.channel);
	
		tv1.channel = 11;
	System.out.println(tv1.channel);
	
		tv1.power();
		tv1.power();
	System.out.println(tv1.power);

	Tv02 tv2 = new Tv02();
	tv2.power();
	int channel = tv2.channelUp();
	System.out.println("���� ä�� :" + channel);
	channel = tv2.channelUp();
	System.out.println("���� ä�� :" + channel);
	tv2.channelDown();
	System.out.println("���� ä�� :" + channel);
	

	
	tv2.volume(20);
	System.out.println("���� ���� :" + tv2.volume); 
	//tv.power();
	
	
	/////////////////��ü�� ���ε��ο���
	
	
	Tv02 tv2_1 = new Tv02();
	tv2_1.power();
	int ch1 = tv2_1.channelUp();
	System.out.println("���� ä�� : " + ch1);
	

	
	}

}
