package test;

public class Hello {

	public static void main(String[] args) {
		// 한줄 주석 (컴파일 안 됨. 사람이 보는 용도)
		/*
		 * 여러줄 주석
		 */
		/*
		System.out.println("내 이름은 김준경입니다");
		System.out.println("이젠 컴퓨터학원");
		System.out.println(2022-2000);
		System.out.println(3.1419 * 2);
		System.out.print("강의실은 ");
		System.out.println("7호실 입니다");
		System.out.println("김둥 사랑해");
		System.out.println("java" + " program");
		*/
		System.out.println(5+7);
		System.out.println("5"+"7");
		System.out.println(8 + 5 + " = 연산 결과");
		// 문자열로 인식 한 줄이 다 주석
		System.out.println("연산결과 = " + 8 + 5);	// 한글 주석 컴파일이 안 돼용. 문자열로 인식
		System.out.println("연산결과 = " + (8 + 5));	// 숫자에 괄호를 넣어주면 숫자 연산
		System.out.println("기절하겠습니다");
		System.out.println("흠.");
	}

}
