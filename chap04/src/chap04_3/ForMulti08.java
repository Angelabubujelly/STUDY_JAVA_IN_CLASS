package chap04_3;
import java.util.Scanner;
public class ForMulti08 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. ����ڷκ��� ���� � ������� �Է� �޽��ϴ�. -scanner 
		 * 2. �� ��� for ����..
		 *   �� <- �ϳ���� ����..
		 *   �١� <-�ΰ� ��� ����..
		 *   �١١�
		 *   �١١١�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� � ����ұ��? : "); //���ڷ� �����ϱ� ��������� int������...
		int star =sc.nextInt();
		
		
		for(int i = 1 ; i<=star;/*����ڰ� ������ ��������..*/ i++) {
				for(int j =1; j<=i; j++) {
					System.out.print("��"); //prinln�� �ϳ���� ������� ��.
					
			}
				System.out.println();

		 
		}
	}

}

