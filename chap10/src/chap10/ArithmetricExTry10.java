package chap10;

import java.util.Scanner;

public class ArithmetricExTry10 {

	public static void main(String[] args) {
		/*사용자로부터 두 수를 입력 받아 몫을 출력하는 while문
		 * 정상적으로 몫이 출력되면 반복문을 빠져나오기
		 * 예외가 발생되면 다시 While문을 돈다.
		 * */

		//1번~~~
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("몫을 구할 두 수 입력 : " );
//			int num1 = sc.nextInt();
//			int num2 = sc.nextInt();
//			int result = num1 / num2;
//			System.out.println("몫 : "+ result);
//		}
//		
		//2번~~~
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("몫을 구할 두 수 입력 : " );
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			try {
				int result = num1 / num2;
				System.out.println("몫 : "+ result);
				break;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니당 . 다시 입력하세요오오오오옹옹"+"\n");
		}
		}
	
	}

}
