package chap04_1;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("점수를 넣으세요 : ");
		int num1 = sc1.nextInt();
		if(num1 >= 90)
			System.out.println("A입니다.");
		else if (num1 >=80)
			System.out.println("B입니다.");
		
		else if (num1 >=70)
			System.out.println("C입니다.");
		
		else if (num1 >=60)
			System.out.println("D입니다.");
		
		else
			System.out.println("F입니다.");
//		int score = 80;
//		if(score >= 90)
//			System.out.println("A");
//		else  //89보다 작은 모든 수...
//			
//			if (score >= 80)
//			System.out.println("B");
//		else
//			System.out.println("F");

		
		
	}

}
