package chap04_04;

public class Break01_mine {

	public static void main(String[] args) {
		/*
		1~100�հ� ���ϴ� for���� �����
		�հ迡 ����ִ� ���� 2500�̻��� ���� �� for���� ����
		*/

		int sum = 0;
		int i;
		for (i =1; i<=100 ; i++ ) {
			sum +=i;
			
			if (sum >= 2500)
				break;
		}

		System.out.println("�հ� = " + sum + ", ���� 2500�� �Ѵ� ��ġ�� = " + i);
		
		
		
	}

}
