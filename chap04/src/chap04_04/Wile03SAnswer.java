package chap04_04;
import java.util.Scanner;
public class Wile03SAnswer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("���� �Է�(�������� -1�Է�) : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 90)
			System.out.println("A����");
		else if(jumsu >= 80)
			System.out.println("B����");
		else if(jumsu >= 70)
			System.out.println("C����");
		else if(jumsu >= 60)
			System.out.println("D����");
		else if(jumsu >= 0)
			System.out.println("F����");
		else if(jumsu == -1)
			break;
	
		}
		System.out.println("���α׷� ����");
	}

}
