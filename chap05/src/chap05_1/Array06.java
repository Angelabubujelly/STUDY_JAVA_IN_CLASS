package chap05_1;

public class Array06 {

	public static void main(String[] args) {
		int[] score = {40,97,98,99,100};

		//����
		//��� ����ϼ���뤷������ �Ҽ��� ���ϱ��� ������ �Ϸ��� double���...
//		int sum = 0;
//		for (int i = 0 ; i<=4; i++) {
//			sum += score[i];
//			
//		}
//		
//		System.out.println("������ = " + sum);
//		System.out.println(sum/i);

		int sum = 0;
		for (int i = 0; i<score.length; i++) { //�̰� ���� �۾ƾ� �ϴ°���? i��???? ���̺��� ��ȣ�� 1�����ϱ�!!!!!!
			sum += score[i];
		}
		System.out.println("�հ� = " + sum);
		double average = (double)sum / score.length;
		System.out.println("����� =" + average);
		
	}

}
