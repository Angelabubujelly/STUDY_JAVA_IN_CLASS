package chap04_2;

import java.util.Scanner;

public class Switchcase06 {

	public static void main(String[] args) {
		// 1. ����ڷκ��� 1~3 �� �ϳ��� ���ڸ� �޴´� <- scanner
		//2. random���� 1~3���ڸ� ������ ���� <- random
		//3. ����ڿ� ��ǻ���� ��� �� ���� �̰���� �Ǵ�. <- switch (user - com)
		//4. 1��-2�� ����� ��. 0 ���º�. -1�� 2�� ��ǻ�� �� <- case ���� 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� ���ڸ� �Է��Ͻÿ�");
		int user =sc.nextInt();
		
		int com = (int)(Math.random()*3+1);
		
		switch(user) {
		case 1:
			System.out.println("����� ���� �Դϴ�.");
			break;
		case 2:
			System.out.println("����� ���� �Դϴ�.");
			break;
		case 3:
			System.out.println("����� �� �Դϴ�.");
		}
		
		if(com == 1) 
			System.out.println("��ǻ�ʹ� ���� �Դϴ�.");
		else if(com ==2)
			System.out.println("��ǻ�ʹ� ���� �Դϴ�.");
		else
			System.out.println("��ǻ�ʹ� �� �Դϴ�.");
		
		switch(user - com) {
		case 1: case -2:
		System.out.println("����� �̰���ϴ�.");
		break;
		
		case -1: case 2:
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		break;
		
		case 0:
			System.out.println("�����ϴ�.");
		}

	}

}
