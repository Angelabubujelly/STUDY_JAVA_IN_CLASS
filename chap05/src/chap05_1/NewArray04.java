package chap05_1;

public class NewArray04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		int sc[] = new int[10];
		double dou[]= new double[3];
		int k = 1;	
		
		score[0] = 10;
		score[1] = 78;
		score[k+1] =100; /*k +1 =2 *///�ε���2���� 100�� ������� �Ҹ�.
		score[3] = 100;
		score[4] = 98;

		
		System.out.println(dou[1]); //int ���� �ʱⰪ ������ �� �ϸ� 0�̶�� �⺻ �ڷ����� ����. ������ 0.0�� �⺻ �ڷ���
		
		int tmp = score[1] + score[4];
		
		System.out.println(tmp);
		System.out.println(score[2]);
	}

}
