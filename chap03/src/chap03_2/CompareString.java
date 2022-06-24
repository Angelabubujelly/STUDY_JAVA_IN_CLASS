package chap03_2;

public class CompareString {

	public static void main(String[] args) {
		String str = "김지원"; //그러나.
		String str2 = new String("김지원");// new 는 반드시 객체를 생성하라는 것임.
		String st3 = "김지원"; //값이 같잖여? str의 주소를 st3에 넣어준 거임..
		//원래 객체를 생성할 땐 이렇게 해야해. String 이라는 객체를 만드는 거양. 근데 길어서,... 

		
		System.out.println(str);
		System.out.println(str2);
		//김지원 나오는 건 마찬가지지만 주소는 다름!
		
		System.out.println("두 변수의 주소가 같은가?" + (str == str2));
		//문자열이 아니라 뒤에 () 섞어줘야 문자도 나오고 불리언 연산결과도 나옴.
		//값이 같은게 아니고 주소가 같은지 물어봤기에 false나옴.
	//new 라는 예약어를 사용하지 않으면 값이 같은 곳의 주소를 가리키도록 함.
		System.out.println(str == st3);
		
		System.out.println("두 변수의 값이 같은가? " + str.equals(str2));
		
	}

}
