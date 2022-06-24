package chap04_05;

import java.util.Scanner;

public class TotalEx01Anser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산할 두 수와 연산자를 입력하시오.(종료시 $입력) ex) 5 * 8 : ");
		int num1 = scan.nextInt();
		String op = scan.next();
		int num2 = scan.nextInt();
		
			
		
		switch(op) { //switch로 할 때는 op의 주소가 아닌 값을 가져오시오임.
			
		case "+":
			System.out.println(num1 + op + num2 + " = " + (num1 + num2 ));
			break;
		case "-":
			System.out.println(num1 + op + num2 + " = " + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + op + num2 + " = " + (num1 * num2));
			break;
		case "%":
			System.out.println(num1 + op + num2 + " = "+ (num1 % num2));
			break;
			default:
				System.out.println("프로그램오류");
			
			
		
		}
		
	System.out.println("끝");
	}

}
