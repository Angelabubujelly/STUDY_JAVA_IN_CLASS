package chap05_1;

import java.util.Scanner;

public class Exercise077 {

	public static void main(String[] args) {
		// exercise7
		// �־��� �迭�� �׸񿡼� �ʤӴ밪�� ���غ�����
		//int[i] <int[i+1]
		//int[i] = int[i+1]
		//
		
		
		int max = 0;
		int[] array = {1,5,3,8,2};
	
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			}
		System.out.println("max: " + max);

/////////////////////////////////////////////////////////
		System.out.println();
		// exercise8
		//�־��� �迭�� ��ü �׸��� �հ� ��հ��� ���ϼ���. (for��)
		
		int[][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}	
		};
	
		int sum = 0;
		double avg = 0.0;
		int count =0;
		
		for (int i = 0; i<array2.length; i++) {
			for (int j = 0; j<array2[i].length; j++) {
				sum += array2[i][j];
			count++;
			}
			
	avg= (double)sum/count;
			
		}
System.out.println(count);
		System.out.println("sum : "+ sum);
		System.out.println("avg: "+ avg);

		
		
/////////////////////////////////////////////////////////
		System.out.println();
// exercise9 
		/*������ Ű����κ��� �л� ���� �л����� ������ �Է¹޾Ƽ�, �ְ�����
		 * �� ��� ������ ���ϴ� Ǫ�α׷��ӵ�. �������� ���� �ۼ��ؽ�
		 * (����� ��ĳ�ʴ� �ֿܼ� �Էµ� ���ڸ� �а� �����Դ�.
		 * 
		 * */
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		

		
		Scanner scanner = new Scanner(System.in);
		
	while(run) {
		System.out.println("-------------");
		System.out.println("1.�л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
		System.out.println("-------------");
		System.out.println("����> ");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
		System.out.println("�л���> ");
		studentNum = scanner.nextInt();
		scores = new int[studentNum];
			
		} else if(selectNo == 2	) {
			for(int i=0; i<scores.length; i++) {
				System.out.println("scores["+ i + "]>");	
				scores[i] = scanner.nextInt();
			}

		} else if(selectNo == 3) {
			for(int i = 0; i<scores.length; i++) {
				System.out.println("score[ " + i + "]: " + scores[i]);	
			}
			
		} else if (selectNo == 4 ) {
			
			int max1 = 0;
			int sum1 = 0;
			double avr = 0;
			
			for(int i = 0; i<scores.length; i++) {
				max = (max<scores[i]?scores[i]:max);
				sum += scores[i];
			}
			avr = (double)sum /studentNum;
			System.out.println("�ְ� ����: " + max);
			System.out.println("��� ����: " + avr);
			//�ۼ� ��ġ
		} else if (selectNo == 5 ) {
			run = false;
		}
	}
	
	System.out.println("���α׷� ����.");
	}
}

