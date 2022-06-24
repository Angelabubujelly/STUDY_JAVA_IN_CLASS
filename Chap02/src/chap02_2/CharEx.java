package chap02_2;

public class CharEx {

	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
//		8진수

		int var2 = 010;
		System.out.println(var2);
//		16진수
		
		int var3 = 0x100;
		System.out.println(var3 + '\n'); //'\n'은 엔터얌
		
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '\u0041';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println("--------------------------------"); //구분선
		
		char ch4 = '가';
		char ch5 = 44032;
		char ch6 = '\uac00';
		
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		int unicode = ch1;
		System.out.println(unicode);
		System.out.println("----");
		
		char ch7 = 'a' + 1; //리터럴 값? a가 유니코드로 하믄 97인데 +1 하니까 98 = b, 출력해보믄
		System.out.println(ch7);
		
//		char ch8 = ch1 + 1; 
		//변수에 들어있는 A에 +1를 하면 에러가 남. 무조건 형변환이 돼 int로 변형되는거라 4바이트가 2바이트로 들어갈 수 없기 때문임.
		
		int i1 = ch7; //98
		int i2 = ch7 + 1; //99
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("-----");
		
		int i3 = 'A' + 'B'; // 형변환 int형으로 변환이 돼서 65+ 66 . . . 고갤 끄덕이지만 이해 잘 못하는듯ㅋ 
		System.out.println(i3);
		
	}

}
