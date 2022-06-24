package tv;

public class TvTest2 {

	public static void main(String[] args) {
		Tv02 tv1 = new Tv02(); //객체생성하는거예용
		Tv02 tv2 = new Tv02();
		Tv02 tv3 = new Tv02();
		
		tv1.channel = 10;
		tv2.channel = 20;
		tv3.channel	= 30;
		
		System.out.println("TV1의 채널은용 : " + tv1.channel);
		System.out.println("TV2의 채널은용 : " + tv2.channel);
		System.out.println("TV3의 채널은용 : " + tv3.channel);

	}

}
