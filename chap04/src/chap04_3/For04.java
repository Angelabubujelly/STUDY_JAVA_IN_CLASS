package chap04_3;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// ������ ���...
		// 1. ����ڷκ��� ����� ����� ������ �Է¹���.
		//2. �Է¹��� ���� ����ϴ� for ��
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� �Է��ϼ���.: ");
		int dan =sc.nextInt();
	
	
		for(int i = 1 ; i<=9; i++) {

			
			System.out.println(dan + " * " + i + " = " + dan *i );
	
		}
			//7*1 �� ���ڴ� ��� ��°ɱ�. � ���ڸ� ������ �ɱ� �ϴ°� �������� ����� �ȴ�ϴ�..��....������.��.��.��.��.��.
	
		
	}

}
