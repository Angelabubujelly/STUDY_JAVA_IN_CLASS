package chap04_05;

import java.util.Scanner;

public class TotalEx01Anser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �� ���� �����ڸ� �Է��Ͻÿ�.(����� $�Է�) ex) 5 * 8 : ");
		int num1 = scan.nextInt();
		String op = scan.next();
		int num2 = scan.nextInt();
		
			
		
		switch(op) { //switch�� �� ���� op�� �ּҰ� �ƴ� ���� �������ÿ���.
			
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
				System.out.println("���α׷�����");
			
			
		
		}
		
	System.out.println("��");
	}

}
