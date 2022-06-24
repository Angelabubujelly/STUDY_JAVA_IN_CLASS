package chap04_05;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// 중첩for문을 이용해 방정식 x + 5y = 60의 모든 해를 구해서 (x,y)로 출력. 단 x와 y는 10이하이다.
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
//		바깥쪽 for가 4.. 안쪽이 5*n..
		
		for(int x =1; x<= 10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x) + (5*y) == 60) 
					System.out.println("(" +x + "), (" + y + ")");
				
			}
		}

		System.out.println("==========================5번 끝\n");
		
		//연습문제 6
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		

		
		
		System.out.println("==========================6번 끝\n");
		
//연습문제 7
		
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------");
			System.out.println("1.예금 | 2. 출금 | 3. 조회 | 4. 종료");
			System.out.println("-----------------");
			System.out.println("선택> ");
			
			int choice = scanner.nextInt();
			int money = 0;
			
			switch(choice) {
			case 1:
				System.out.print("예금액> ");
			money = scanner.nextInt();
			balance += money;
			break;
			
			case 2:
				System.out.println("출금액> ");
			money = scanner.nextInt();
			if(balance >= money)
			balance -= money;
			else
				System.out.println("잔액이 부족합니다.");
			break;
			
			case 3:
				System.out.println("잔고> " + balance);
				break;
				
			case 4:
				run = false;
			
			}
		}
		System.out.println("프로그램 종료");
	}

}
