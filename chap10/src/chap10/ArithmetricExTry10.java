package chap10;

import java.util.Scanner;

public class ArithmetricExTry10 {

	public static void main(String[] args) {
		/*����ڷκ��� �� ���� �Է� �޾� ���� ����ϴ� while��
		 * ���������� ���� ��µǸ� �ݺ����� ����������
		 * ���ܰ� �߻��Ǹ� �ٽ� While���� ����.
		 * */

		//1��~~~
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("���� ���� �� �� �Է� : " );
//			int num1 = sc.nextInt();
//			int num2 = sc.nextInt();
//			int result = num1 / num2;
//			System.out.println("�� : "+ result);
//		}
//		
		//2��~~~
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���� ���� �� �� �Է� : " );
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			try {
				int result = num1 / num2;
				System.out.println("�� : "+ result);
				break;
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ� . �ٽ� �Է��ϼ�����������˿�"+"\n");
		}
		}
	
	}

}
