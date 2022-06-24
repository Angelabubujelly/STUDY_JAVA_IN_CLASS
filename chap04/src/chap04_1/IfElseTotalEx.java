package chap04_1;
import java.util.Scanner;
public class IfElseTotalEx {

	public static void main(String[] args) {
		//사용자로부터 정수를 입력 받아 저장
		//양수(짝수인지 홀수이지)인지 음수(짝수인지 홀수인지)인지 0인지
		//출력문 = 양수, 짝수면 ->양수입니다. 짝수입니다. 
		//양수,홀수면 -> 양수입니다. 홀수입니다. 반대도 마찬가지
		// 홀수면 (num1 % 2 == 1) 
		//0= 0입니다. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		String ber ="";
		// ~~~~~~~~~~~~~~~중첩 if말고 논리연산자로 하는 법 ~~~~~~~
		// 양수이면서 짝수인가? if( num >0 &&  num % 2 == 0) {
		// System.out.println("양수입니다\n짝수입니다.");
		// 양수이면서 홀수인가? else if ( num >0  && num % 2 == 1) {
		// System/out.println ("양수입니다\n홀수입니다.");
		// } else if(num <0 && num % 2 == 0) {
		// System/out.println ("음수입니다.\n 짝수입니다.");
		// else if (num < 0 && num % 2 == -1 ) {
		// System.out.println ("읍수입니다. \n 홀수입니다.");
		// } else {
		// System.out.println("0입니다."); }
		
		if(num > 0) {
			System.out.println("양수입니다.");
			if ( num % 2 == 0) {
				System.out.println("짝수입니다.");}
			else {
				System.out.println("홀수입니다.");
			}
		} else if (num <0) {
			System.out.println("음수입니다.");
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
		} else {
			System.out.println("음수 입니다.");
		}
		} else {
			System.out.println("0입니다.");
		}
			
		System.out.println(ber);
		
	
			

	}

}
