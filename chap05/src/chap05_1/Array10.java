package chap05_1;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�ο��� 5��, ������ 3����
//		int[][] score = {{98,73,50},
//						 {70,80,40},
//						 {90,80,60},
//						 {0,10,100},
//						 {41,42,43}};
//		
//	
//				
//		int korTotal = 0;
//		int mathTotal = 0;
//		int engTotal = 0;
//		System.out.println("---------------------------------");
//		System.out.println("��ȣ | ���� | ���� | ���� | ���� | ���");
//		System.out.println("---------------------------------");
//		for (int i = 0; i<score.length; i++) {
//			int sum = 0; //sum�� ��ġ �Ű澲��
//		double avg = 0.0;
//		
//		korTotal +=score[i][0];
//		engTotal +=score[i][1];
//		mathTotal +=score[i][2];
//		
//			for(int j= 0; j<score[i].length; j++) {
//			sum += score[i][j];	
//
//			}
//			avg = (double)sum / score[i].length;
//			System.out.println(i+1 +" | "+ " | " +" | " +" | " +sum +" | "+ (int)avg );
//	
//			
//
//		}
//
//
//System.out.println("---------------------------------");
//System.out.println("���� | " + korTotal +" | "+ engTotal +" | " + mathTotal+" | "+"   | "+"   | ");	
//		System.out.println("---------------------------------");

		int[][] score = {{98,73,50},
				 {70,80,40},
				 {90,80,60},
				 {10,10,90},
				 {41,42,43}};


		
		int korTotal = 0;
		int mathTotal = 0;
		int engTotal = 0;
		
		
		System.out.println("---------------------------------");
		System.out.println("��ȣ | ����| ����| ����| ����| ���");
		System.out.println("---------------------------------");

		for (int i = 0; i<score.length; i++) {
			int sum = 0; //sum�� ��ġ �Ű澲��
			double avg = 0.0;

			korTotal +=score[i][0];
			engTotal +=score[i][1];
			mathTotal +=score[i][2];

		System.out.printf("%3d", i+1);
			for(int j= 0; j<score[i].length; j++) {
			sum += score[i][j];	
		System.out.printf("%5d" , score[i][j] );
			}
			System.out.printf("%5d", sum);
			System.out.print( "   ");
			avg = (double)sum / score[i].length;
			System.out.printf("%.1f\n", avg);
}


		System.out.println("---------------------------------");
		System.out.printf("���� %4d %4d %4d \n", korTotal, engTotal, mathTotal);	
		System.out.println("---------------------------------");

//	System.out.printf("���� %d %d %d\n", korTotal,engTotal,mathTotal); //�ڸ��� ���߱� ���� ���..%d�� ��Ż. 
//	System.out.printf("��� %f %f %f\n", 78.3,62.3,67.2);
//	System.out.printf("�̸� %s %s %s\n", "ȫ�浿", "�̼���", "�ƹ���");
//	System.out.printf("%5d\n", 34);
//	System.out.printf("%05d\n", 34);
//	System.out.printf("%5.2f\n", 1235.489); //��ü�ڸ���.�Ҽ��� �� �ڸ�
//	System.out.printf("%.2f", 34.888); //. ���̹� �����κ��� �����Ƶ� �Ű� �Ⱦ���...
	}

}
