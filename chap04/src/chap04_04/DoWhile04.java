package chap04_04;
import java.util.Scanner;


public class DoWhile04 {

	public static void main(String[] args) {
		boolean run = false;
	do {
		System.out.println("do~while ���� �ʹ��ʹ� ����������뤷��뤷��");
		System.out.println("����");

	} while(run); //�� ������ �����ݷ��� �ٿ��ݴϴ�... ��� �׻� ���̿���~~
	
	while(run) {
		System.out.println("while");
		System.out.println("����");
	}
	
	Scanner scan = new Scanner(System.in);
	String str;
	do {
		

	System.out.println("�޽��� �Է�(�����Ϸ��� 'q' �Է� ) : ");
	str = scan.nextLine(); //next�� �ܾ� ������ ���Ϳ뤷��
	System.out.println(str);
	} while (!str.equals("q")); //! ���̴°� ���޴´�... �Ѥ�
System.out.println("���α׷� ����.");
	}
}
