package chap04_1;
import java.util.Scanner;
public class IfElseTotalEx {

	public static void main(String[] args) {
		//����ڷκ��� ������ �Է� �޾� ����
		//���(¦������ Ȧ������)���� ����(¦������ Ȧ������)���� 0����
		//��¹� = ���, ¦���� ->����Դϴ�. ¦���Դϴ�. 
		//���,Ȧ���� -> ����Դϴ�. Ȧ���Դϴ�. �ݴ뵵 ��������
		// Ȧ���� (num1 % 2 == 1) 
		//0= 0�Դϴ�. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		String ber ="";
		// ~~~~~~~~~~~~~~~��ø if���� �������ڷ� �ϴ� �� ~~~~~~~
		// ����̸鼭 ¦���ΰ�? if( num >0 &&  num % 2 == 0) {
		// System.out.println("����Դϴ�\n¦���Դϴ�.");
		// ����̸鼭 Ȧ���ΰ�? else if ( num >0  && num % 2 == 1) {
		// System/out.println ("����Դϴ�\nȦ���Դϴ�.");
		// } else if(num <0 && num % 2 == 0) {
		// System/out.println ("�����Դϴ�.\n ¦���Դϴ�.");
		// else if (num < 0 && num % 2 == -1 ) {
		// System.out.println ("�����Դϴ�. \n Ȧ���Դϴ�.");
		// } else {
		// System.out.println("0�Դϴ�."); }
		
		if(num > 0) {
			System.out.println("����Դϴ�.");
			if ( num % 2 == 0) {
				System.out.println("¦���Դϴ�.");}
			else {
				System.out.println("Ȧ���Դϴ�.");
			}
		} else if (num <0) {
			System.out.println("�����Դϴ�.");
			if (num % 2 == 0) {
				System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("���� �Դϴ�.");
		}
		} else {
			System.out.println("0�Դϴ�.");
		}
			
		System.out.println(ber);
		
	
			

	}

}
