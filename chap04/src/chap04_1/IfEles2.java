package chap04_1;
import java.util.Scanner;
public class IfEles2 {

	public static void main(String[] args) {
//		int num1 =78;
//		
//		if	(num1 % 2 == 1) 
//			System.out.println("Ȧ���Դϴ�.");
//		else// (num1 % 2 == 0)
//		System.out.println("¦���Դϴ�.");
		
		Scanner sc1 = new Scanner(System.in);
		
//		System.out.println("�̸��� �������� : ");
//		String str1 = sc1.next();
//		System.out.println(str1);
//		
//		System.out.println("��̰� �����Դϱ�? ");
//		String hobby = sc1.next();
//		System.out.println(hobby);
		

//		System.out.println("���̸� �������� : ");
//		int age = sc1.nextInt();
//		System.out.println(2022-age);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num2 = sc1.nextInt();
		if(num2 % 2 ==0)
			System.out.println("¦�� �Դϴ�.");
		else
			System.out.println("Ȧ�� �Դϴ�.");
	}

}
