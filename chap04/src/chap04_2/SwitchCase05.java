package chap04_2;

import java.util.Scanner; //import��ĳ�� �־��ִ°� �� �� 

public class SwitchCase05 {

	public static void main(String[] args) {
		// ������ �Է� �޾Ƽ� ������ ���. A,B,C,D,F �� �ϳ� ����ϱ�
		Scanner	scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		char grade ;

		switch(score/10) { //int / int = �� ���⶧����...
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
		System.out.println("����� ������" + grade + "�Դϴ�.");
	}
}
