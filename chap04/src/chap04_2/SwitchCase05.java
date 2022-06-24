package chap04_2;

import java.util.Scanner; //import스캐너 넣어주는거 필 수 

public class SwitchCase05 {

	public static void main(String[] args) {
		// 점수를 입력 받아서 학점을 출력. A,B,C,D,F 중 하나 출력하기
		Scanner	scan = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		char grade ;

		switch(score/10) { //int / int = 몫만 남기때문에...
		case 10: case 9:
		grade = 'A';
		break;
		
		case 8: case 7:
			grade = 'B';
			break;
			
		case 6:	case 5:
			grade = 'D';
			break;
		case 4: case 3:
			grade = 'D';
			break;
		default : 
		grade = 'F';
	
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
	}
}
