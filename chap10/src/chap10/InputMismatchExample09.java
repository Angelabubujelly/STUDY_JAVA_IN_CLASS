package chap10;

//import java.util.*;  ☜ 모든것
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개 입력 ");
		int sum = 0;
		int user = 0;
		
//		System.out.println("이름 입력 : ");
//		String name = scan.next(); //next는 단어단위로 읽어...
//		String name2 = scan.next()	;
//		String name3 = scan.next() ;
//		System.out.println(name + " ,  " + name2 +  " ,  " + name3);
//		
		for(int i=1; i<=3; i++) {
			System.out.println(i + "번째 정수 입력 : ");
	try {
			user = scan.nextInt()	;
			sum +=user;
	} catch (InputMismatchException e) {
		System.out.println("정수가 아닙니다.");
		scan.next()	; // 한얼 says /n을 여기에 담을테니 다음 토큰으로 넘어가쇼
								i--;
	}
		}
		System.out.println("합 = "+ sum);
			}

				}
