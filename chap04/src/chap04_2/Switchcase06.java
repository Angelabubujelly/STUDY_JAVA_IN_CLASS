package chap04_2;

import java.util.Scanner;

public class Switchcase06 {

	public static void main(String[] args) {
		// 1. 사용자로부터 1~3 중 하나의 숫자를 받는다 <- scanner
		//2. random으로 1~3숫자를 추출해 저장 <- random
		//3. 사용자와 컴퓨터의 대결 뒤 누가 이겼는지 판단. <- switch (user - com)
		//4. 1과-2는 사용자 승. 0 무승부. -1과 2는 컴퓨터 승 <- case 제시 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중 하나의 숫자를 입력하시오");
		int user =sc.nextInt();
		
		int com = (int)(Math.random()*3+1);
		
		switch(user) {
		case 1:
			System.out.println("당신은 가위 입니다.");
			break;
		case 2:
			System.out.println("당신은 바위 입니다.");
			break;
		case 3:
			System.out.println("당신은 보 입니다.");
		}
		
		if(com == 1) 
			System.out.println("컴퓨터는 가위 입니다.");
		else if(com ==2)
			System.out.println("컴퓨터는 바위 입니다.");
		else
			System.out.println("컴퓨터는 보 입니다.");
		
		switch(user - com) {
		case 1: case -2:
		System.out.println("당신이 이겼습니다.");
		break;
		
		case -1: case 2:
			System.out.println("컴퓨터가 이겼습니다.");
		break;
		
		case 0:
			System.out.println("비겼습니다.");
		}

	}

}
