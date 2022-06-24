package chap04_04;
import java.util.Scanner;
public class While02ItsMe {

	public static void main(String[] args) {
//		boolean run = true;
//		int speed = 0, keyCode = 0;
//		
//		while(run) /*run 은 참이기에 while 문은 무한으로 재생 ㄷ ㄷ ㄷ */{
//			//System.in.read(); // 키보드로 누른 것을 읽어 가져오시오... scanner랑 같은거랭...;;;;
//			
//			if(keyCode != 13 && keyCode!=10) {
//				System.out.println("--------------------");
//				System.out.println("1.증속 | 2. 감속 | 3. 중지 ");
//				System.out.println("---------------------");	
//				System.out.println("선택 : ");
//			}
//			
//		Scanner sc = new Scanner(System.in);
//
//
//		for (int keyCode = 0 ; keyCode <=3 ; keyCode++) {
//			if(keyCode ==1) {
//				speed++;
//			}
//				System.out.println("현재속도 : " + speed);
//			} else if(keyCode == 2) {
//			speed--;
//			System.out.println("현재속도 : " + speed);
//		} else if (keyCode == 3) {
//			run = false;
//		
//		}
//System.out.println("프로그램 종료");
//		}
		
		boolean run = true;
		int speed = 0;
		
		Scanner scan = new Scanner(System.in);
		while(run) {
		System.out.println("--------------------");
		System.out.println("1.증속 | 2. 감속 | 3. 중지 ");
		System.out.println("---------------------");	
		System.out.println("선택 : ");
		
		int choice = scan.nextInt();
		
	
		if(choice == 1) {
			speed++;
		System.out.println("현재 속도 : " + speed);
		}
		else if (choice ==2) {
			speed--;
			System.out.println("현재 속도 : " + speed);
		}
		else if(choice ==3)
			run=false;
		}
		
		System.out.println("프로그램 종료.");
	}
}
