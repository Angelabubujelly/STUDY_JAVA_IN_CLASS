package tv;

public class TvTest2 {

	public static void main(String[] args) {
		Tv02 tv1 = new Tv02(); //��ü�����ϴ°ſ���
		Tv02 tv2 = new Tv02();
		Tv02 tv3 = new Tv02();
		
		tv1.channel = 10;
		tv2.channel = 20;
		tv3.channel	= 30;
		
		System.out.println("TV1�� ä������ : " + tv1.channel);
		System.out.println("TV2�� ä������ : " + tv2.channel);
		System.out.println("TV3�� ä������ : " + tv3.channel);

	}

}
