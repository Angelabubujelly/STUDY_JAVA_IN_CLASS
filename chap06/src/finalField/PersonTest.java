package finalField;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person ("123456-123456", "����ȫ");
		System.out.println(p1.NATION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);
		
		//��� NATION�� SSN�� ���� �ٲ� �� ����.
		p1.name = "����";
		System.out.println(p1.name);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
/////////////////////////////////////////////////////////
		
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �Է��ϼ���. : ");
		int radius =sc.nextInt();
		
		
		System.out.println("���� ������ " + radius*radius*PI + "�Դϴ�.");
		
		/*System.out.println("int : "+ Integer.MIN_VALUE + " ~ "+ Integer.MAX_VALUE); //I�빮�ڸ� 
		System.out.println("long : "+ Long.MIN_VALUE + " ~ "+ Long.MAX_VALUE);
		 ���ѵ鵵 ����ΰſ�... �ѹ� ���� ������� �ʴ� ���ΰ�...
		*
		*/
	}

}
