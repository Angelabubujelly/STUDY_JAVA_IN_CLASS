package chap05_1;

import java.util.Scanner;

public class Exercise07Answer {

	public static void main(String[] args) {
	int [][] array = {
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
	};
	
	int sum =0 ;
	double avg = 0.0;
	int count = 0;
	
	for (int i=0; i<array.length; i++) {
		count += array[i].length;
		for (int j=0 ; j<array[i].length; j++) {
			sum+= array[i][j];
		}
	}
	
	avg = (double)sum / (count);
	
	System.out.println("sum: = " + sum);
	System.out.println("avg: = " + avg);

/////////////////////////////////////////////////////////
System.out.println();
	// exercise9 
			/*������ Ű����κ��� �л� ���� �л����� ������ �Է¹޾Ƽ�, �ְ�����
			 * �� ��� ������ ���ϴ� Ǫ�α׷��ӵ�. �������� ���� �ۼ��ؽ�
			 * (����� ��ĳ�ʴ� �ֿܼ� �Էµ� ���ڸ� �а� �����Դ�.
			 * 
			 * */
//	boolean run = true;
//	int studentNum = 0;
//	int[] scores = null;
//	int k = 0;
//	Scanner scanner = new Scanner(System.in);
//	
//	while(run) {
//		System.out.println("-------------");
//		System.out.println("1.�л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
//		System.out.println("-------------");
//		System.out.println("����> ");
//		
//		int selectNo = scanner.nextInt();
//		
//		if(selectNo == 1)
//			System.out.println("�л���> ");
//			studentNum = scanner.nextInt();
//			scores = new int[studentNum];
			
//		} else if  (selectNo == 2) {
//			for(k =0; k<studentNum; k++) {
//			System.out.println("score["+ k +"] > ");
//			scores[k] =scanner.nextInt();
//	}
//		} else if(selectNo ==3){
//			int max1 = scores[0];
//			int hap	= 0;
//			double avr =0;
//			
//			
//			
//			for(int i=0; i<studentNum; i++ 	) {
//				hap += scores[i];
//				if (max1 <scores[i]) {
//					max1 = scores[i+1];
//			}
//			
//					}
//			System.out.println("�ְ� ����: " + max1);
//			System.out.println("��� ����: " + (double)hap/studentNum);
//			System.out.println("��� ���� : %.2f\n", (double)hap/studentNum); <- �� �ۼ�Ʈ�� ����� �޸�����                                                                                                              
//		}
//			
	
	}

}
