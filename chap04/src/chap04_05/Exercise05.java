package chap04_05;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// ��øfor���� �̿��� ������ x + 5y = 60�� ��� �ظ� ���ؼ� (x,y)�� ���. �� x�� y�� 10�����̴�.
		//4*1 + 5*1 =9
//		4*1+ 5*2 =14
//		4*1+ 5*3=19
//		4*1+ 5*4 =24
//		4*1+ 5*5 =29
//		4*1+ 5*6 =34
//		4*1+ 5*7 =39
//		4*1+ 5*8 =44
//		4*1+ 5*9 =49
//		4*1+ 5*10 =54
//		
//		4*1 + 5*1 = 13
//		4*2 + 5*2 = 18
//		4*3 + 5*3 = 22
//		4*4 + 5*4 = 26
//		4*5 + 5*5 = 30
//		4*6 + 5*6 = 34
//		�ٱ��� for�� 4.. ������ 5*n..
		
		for(int x =1; x<= 10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x) + (5*y) == 60) 
					System.out.println("(" +x + "), (" + y + ")");
				
			}
		}

		System.out.println("==========================5�� ��\n");
		
		//�������� 6
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		

		
		
		System.out.println("==========================6�� ��\n");
		
//�������� 7
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------");
			System.out.println("1.���� | 2. ��� | 3. ��ȸ | 4. ����");
			System.out.println("-----------------");
			System.out.println("����> ");
			
			int choice = scanner.nextInt();
			int money = 0;
			
			switch(choice) {
			case 1:
				System.out.print("���ݾ�> ");
			money = scanner.nextInt();
			balance += money;
			break;
			
			case 2:
				System.out.println("��ݾ�> ");
			money = scanner.nextInt();
			if(balance >= money)
			balance -= money;
			else
				System.out.println("�ܾ��� �����մϴ�.");
			break;
			
			case 3:
				System.out.println("�ܰ�> " + balance);
				break;
				
			case 4:
				run = false;
			
			}
		}
		System.out.println("���α׷� ����");
	}

}
