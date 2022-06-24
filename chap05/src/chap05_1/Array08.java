package chap05_1;

public class Array08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 2) /*if(args.length != 2)*/{
			System.out.println("프로그램 사용법 :");
			System.out.println("run Arguments에 2개의 문자를 입력하시오.");
			System.exit(0);
		}

		for (int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
//sting(주소) ->참조자료형, int(값)	 -> 기본자료형
		int num1 =Integer.parseInt(args[0]); /*클래스이름.메소드이름 임,... args를int로 변환..*/
		int num2 =Integer.parseInt(args[1]);
		
		System.out.println("두 수의 곱 = "+ num1*num2);
	}

}
