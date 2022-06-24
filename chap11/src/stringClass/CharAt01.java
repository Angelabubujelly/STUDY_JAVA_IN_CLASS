package stringClass;

public class CharAt01 {

	public static void main(String[] args) {
		String str = "[과정평가형]자바 웹개발 프로그래밍";
		
		char ch1 = str.charAt(7);
		System.out.println(ch1);
		
		String sn = "220508-4110000";
		char ch2 = 	sn.charAt(7);
		System.out.println(ch2);
		
		switch(ch2	) {
		case '1': case '3': //수가 아니고 char니꽈 외 따 옴 표 넣 어 주 쇼
			System.out.println("남자입니다.");
			break;
		case '2': case '4':
			System.out.println("여자입니다.");
		}
	}

}
