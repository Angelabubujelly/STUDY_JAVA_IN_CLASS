package tv;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv02 tv1 = new Tv02();
		tv1.power(); //power는 변수를 의미, power()메소드 의미!! 얘 메소드 부른거져
	System.out.println("tv 전원 : " + tv1.power); //얜 파워으ㅣ 속성값 출력..

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
	System.out.println("현재 채널 :" + channel);
	channel = tv2.channelUp();
	System.out.println("현재 채널 :" + channel);
	tv2.channelDown();
	System.out.println("현재 채널 :" + channel);
	

	
	tv2.volume(20);
	System.out.println("현재 볼륨 :" + tv2.volume); 
	//tv.power();
	
	
	/////////////////객체가 따로따로예용
	
	
	Tv02 tv2_1 = new Tv02();
	tv2_1.power();
	int ch1 = tv2_1.channelUp();
	System.out.println("현재 채널 : " + ch1);
	

	
	}

}
