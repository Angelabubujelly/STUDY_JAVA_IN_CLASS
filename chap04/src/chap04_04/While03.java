package chap04_04;
import java.util.Scanner;
public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. ����ڷκ��� ������ �Է¹޾� ����
		 * 2. A~F���� ���
		 * a 10090
		 * b  90 80
		 * c 070
		 * d 7060
		 * 60 ��
		 3. �����Ҷ����� ���� ����� �������*/

		boolean run = true;
		
		Scanner scan = new Scanner(System.in);
		while(run) {
			System.out.println("������ �Է��ϼ���. :" );
			
		int score = scan.nextInt();
		char grade ;
		
		if (score >= 90) {
			grade = 'A';
			System.out.println("������ " +grade + "�Դϴ�.");
		} else if (score >= 80) {
			grade = 'B';
			System.out.println("������ " +grade + "�Դϴ�.");
		} else if (score >= 70) {
			grade = 'C';
			System.out.println("������ " +grade + "�Դϴ�.");
		} else if (score >= 60) {
			grade = 'D';
			System.out.println("������ " +grade + "�Դϴ�.");
		} else if (score >= 60) 
			
			run = false;

		}
		
		System.out.println("���α׷� ����.");
	}

}
