package chap04_1;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("������ �������� : ");
		int num1 = sc1.nextInt();
		if(num1 >= 90)
			System.out.println("A�Դϴ�.");
		else if (num1 >=80)
			System.out.println("B�Դϴ�.");
		
		else if (num1 >=70)
			System.out.println("C�Դϴ�.");
		
		else if (num1 >=60)
			System.out.println("D�Դϴ�.");
		
		else
			System.out.println("F�Դϴ�.");
//		int score = 80;
//		if(score >= 90)
//			System.out.println("A");
//		else  //89���� ���� ��� ��...
//			
//			if (score >= 80)
//			System.out.println("B");
//		else
//			System.out.println("F");

		
		
	}

}
