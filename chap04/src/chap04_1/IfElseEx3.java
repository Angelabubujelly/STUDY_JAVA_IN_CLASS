package chap04_1;

import java.util.Scanner; //ㅇ이거 중요!!!!!!!!!!!!!!!!!!! 스캐너 쓸 땐 꼭 임포트 해줘야 함.

public class IfElseEx3 {

	public static void main(String[] args) {
//		//랜덤으로 1~5까지 추춘 후 저장
//		//사용자가 숫자를 넣도록 해
//		//랜덤으로 나온 숫자와 사용자가 넣은 숫자가 같으면 
//		//맞췄습ㄴㅣ다. or 틀렸습니다.
//		
//		int random = (int)(Math.random()*6);
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오.");
//		int num = scan.nextInt();
//		
//		if(num == random)
//			System.out.println("맞췄습니다.");
//		
//		else 
//			System.out.println("틀렸습니다.");
//------------------------------------------------------
		
		
		int random1 = (int)(Math.random()*5) + 1; //4.999에 int로 변환해서 0~4까지 나오는데 뒤에 +1 하니꽈 0~5까지 나오는거얌
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5까지 숫자를 맞춰보세요 : ");
		int user = sc.nextInt(); //실수형하구시픔 double 하구 불리언두되구 다 됨 걍 지금은 정수형이라 Int형이얌	
		String str = sc.next();
		double dou = sc.nextDouble();
		
		
		if (random1 == user)
			System.out.println("맞췄습니다.");
		else {
			System.out.println("틀렸습니다.");
			System.out.println("정답은 "+ random1 + "입니다.");
	}
	}

	
	
}
