package chap04_1;

public class ifElseEx {

	public static void main(String[] args) {
		int score = 77;
		
		if(score >= 80) {
			System.out.println("�����մϴ�.");
			System.out.println("�հ��Դϴ�");
		} else {
			System.out.println("���հ��Դϴ�.");
			System.out.println("���� ��ȸ��...");
		}

		// �� ���� �� �߰�ȣ�� �ص� �ǰ� ���ص� ��
		if(score >= 80)
			System.out.println("�����Դϴ�");
		else
			System.out.println("�ٺ��Դϴ�.");
		
		if(score >= 90) 
		
			System.out.println("����Դϴ�");
		else {
			System.out.println("�������Դϴ�.");
			System.out.println("���� ��ȸ��...");
		}
		
		
	}

}
