package chap04_04;
import java.util.Scanner;
public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 사용자로부터 점수를 입력받아 저장
		 * 2. A~F학점 출력
		 * a 10090
		 * b  90 80
		 * c 070
		 * d 7060
		 * 60 이
		 3. 중지할때까지 점수 물어보고 학점출력*/

		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		while(run) {
			System.out.println("점수를 입력하세요. :" );
			
		int score = scan.nextInt();
		char grade ;
		
		if (score >= 90) {
			grade = 'A';
			System.out.println("학점은 " +grade + "입니다.");
		} else if (score >= 80) {
			grade = 'B';
			System.out.println("학점은 " +grade + "입니다.");
		} else if (score >= 70) {
			grade = 'C';
			System.out.println("학점은 " +grade + "입니다.");
		} else if (score >= 60) {
			grade = 'D';
			System.out.println("학점은 " +grade + "입니다.");
		} else if (score >= 60) 
			
			run = false;

		}
		
		System.out.println("프로그램 종료.");
	}

}
