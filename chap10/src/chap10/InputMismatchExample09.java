package chap10;

//import java.util.*;  �� ����
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 3�� �Է� ");
		int sum = 0;
		int user = 0;
		
//		System.out.println("�̸� �Է� : ");
//		String name = scan.next(); //next�� �ܾ������ �о�...
//		String name2 = scan.next()	;
//		String name3 = scan.next() ;
//		System.out.println(name + " ,  " + name2 +  " ,  " + name3);
//		
		for(int i=1; i<=3; i++) {
			System.out.println(i + "��° ���� �Է� : ");
	try {
			user = scan.nextInt()	;
			sum +=user;
	} catch (InputMismatchException e) {
		System.out.println("������ �ƴմϴ�.");
		scan.next()	; // �Ѿ� says /n�� ���⿡ �����״� ���� ��ū���� �Ѿ��
								i--;
	}
		}
		System.out.println("�� = "+ sum);
			}

				}
