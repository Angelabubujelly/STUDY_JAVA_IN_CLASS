package chap04_1;

import java.util.Scanner; //���̰� �߿�!!!!!!!!!!!!!!!!!!! ��ĳ�� �� �� �� ����Ʈ ����� ��.

public class IfElseEx3 {

	public static void main(String[] args) {
//		//�������� 1~5���� ���� �� ����
//		//����ڰ� ���ڸ� �ֵ��� ��
//		//�������� ���� ���ڿ� ����ڰ� ���� ���ڰ� ������ 
//		//��������Ӵ�. or Ʋ�Ƚ��ϴ�.
//		
//		int random = (int)(Math.random()*6);
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��Ͻÿ�.");
//		int num = scan.nextInt();
//		
//		if(num == random)
//			System.out.println("������ϴ�.");
//		
//		else 
//			System.out.println("Ʋ�Ƚ��ϴ�.");
//------------------------------------------------------
		
		
		int random1 = (int)(Math.random()*5) + 1; //4.999�� int�� ��ȯ�ؼ� 0~4���� �����µ� �ڿ� +1 �ϴϲ� 0~5���� �����°ž�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5���� ���ڸ� ���纸���� : ");
		int user = sc.nextInt(); //�Ǽ����ϱ����� double �ϱ� �Ҹ���εǱ� �� �� �� ������ �������̶� Int���̾�	
		String str = sc.next();
		double dou = sc.nextDouble();
		
		
		if (random1 == user)
			System.out.println("������ϴ�.");
		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("������ "+ random1 + "�Դϴ�.");
	}
	}

	
	
}
