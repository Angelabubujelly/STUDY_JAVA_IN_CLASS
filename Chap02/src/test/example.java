package test;

public class example {

	public static void main(String[] args) {

		// ���� 3�� �����
		// ù��° ������ ����� ���� �ֱ�
		// �ι�° ������ ����� ���� �ֱ�
		// ����° ������ ����� ù��° ������ �ι�° ������ ���� ����� �ֱ�
		// ����° ������� (��¹��� �� : 13 + 4 = 17)
		// ����° ������ ù��° �������� 10�� ���� �ֱ� 13- 10
		// ����° ���� ���
		//����° ������ �ι�° �������� 3�� ���ؼ� �ֱ� 4 *3
		//����° ���� ���

				int first = 13;
				int second = 4;
				int third = -10;
				int result = first + second;
				int result2 = first + second + third;
				
				/*
				 * System.out.println("������ =" + result); System.out.println("  = " + (result
				 * -10) ); int result2 = 7; System.out.println("=" + (result2 * 3));
				 */
				
				System.out.println(first + "+" + second + "=" + result);
				System.out.println(result  + -10 + "=" + result2);
				
				result = first - 10;
				System.out.println(first + "-10 =" + result);
				
				result = second + 3;
				System.out.println(second + "*3="+ result);
				
	}
				
}
