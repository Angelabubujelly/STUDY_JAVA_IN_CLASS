package chap05_1;

public class Array07 {

	public static void main(String[] args) {
		int[] score = {12,14,65,57,23,57,89,100,24,84};
		
		//�ִ밪�� ����ϴ� ���α׷�
/* 10���� ���� �߿��� ���� ū ���ڸ� �������� ���� �񱳸� �ؾ���. 
 * i = 0, 12.
 * i = 1, 14
 * i > i++
 * i0 < i1
 * i =1 �� i =2�� ���ؾ� ��. 
 * i1 < i2
 * i= 2�� i=3 �� ��.
 * i=2> i=3
 * i2�� i=4�� ���ؾ� ��. 
 * 
 * 
 * 
 * */
//		int i = 0;
//		for (i = 0; i<score.length;i++ ) {
//			num[i] 
//		}
		
		int max = score[0]; //= int max; max = 0�� ���� �����ϱ� �ʱⰪ�� 1���� �ص� ��.
		
				for(int i = 1; i<score.length; i++) {
					if(max < score[i]) {
						max = score[i]; //�ƽ��� ���� ���ھ�� �־��ش�...
					}
				}
System.out.println("�ִ밪 = " + max);
				
		//==============================

//int min = score[0];
//for(int i = 1; i<score.length; i++) {
//	if(min >score[i]) {
//		min = score[i];
//	}
//}
//
//	System.out.println("�ּҰ� = " + min);
//	}

/////////////////////////////////////////////

int min = score[0]; //= int max; max = 0�� ���� �����ϱ� �ʱⰪ�� 1���� �ص� ��.

for(int i = 1; i<score.length; i++) {
	if(max < score[i]) {
		max = score[i];
		//				max = (max<scores[i]?scores[i]:max);
	}
	if (min >score[i]) {
		min = score[i];
	}
}
System.out.println("�ּҰ� = " + min);
System.out.println("�ִ밪 = " + max);




	}
}
