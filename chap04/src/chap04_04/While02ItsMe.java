package chap04_04;
import java.util.Scanner;
public class While02ItsMe {

	public static void main(String[] args) {
//		boolean run = true;
//		int speed = 0, keyCode = 0;
//		
//		while(run) /*run �� ���̱⿡ while ���� �������� ��� �� �� �� */{
//			//System.in.read(); // Ű����� ���� ���� �о� �������ÿ�... scanner�� �����ŷ�...;;;;
//			
//			if(keyCode != 13 && keyCode!=10) {
//				System.out.println("--------------------");
//				System.out.println("1.���� | 2. ���� | 3. ���� ");
//				System.out.println("---------------------");	
//				System.out.println("���� : ");
//			}
//			
//		Scanner sc = new Scanner(System.in);
//
//
//		for (int keyCode = 0 ; keyCode <=3 ; keyCode++) {
//			if(keyCode ==1) {
//				speed++;
//			}
//				System.out.println("����ӵ� : " + speed);
//			} else if(keyCode == 2) {
//			speed--;
//			System.out.println("����ӵ� : " + speed);
//		} else if (keyCode == 3) {
//			run = false;
//		
//		}
//System.out.println("���α׷� ����");
//		}
		
		boolean run = true;
		int speed = 0;
		
		Scanner scan = new Scanner(System.in);
		while(run) {
		System.out.println("--------------------");
		System.out.println("1.���� | 2. ���� | 3. ���� ");
		System.out.println("---------------------");	
		System.out.println("���� : ");
		
		int choice = scan.nextInt();
		
	
		if(choice == 1) {
			speed++;
		System.out.println("���� �ӵ� : " + speed);
		}
		else if (choice ==2) {
			speed--;
			System.out.println("���� �ӵ� : " + speed);
		}
		else if(choice ==3)
			run=false;
		}
		
		System.out.println("���α׷� ����.");
	}
}
