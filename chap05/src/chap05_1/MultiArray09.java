package chap05_1;

public class MultiArray09 {

	public static void main(String[] args) {
		int[][] score = {{3,7,8}, /* int[2][3]*/
				     	{9,4,2}};

		System.out.println(score[1][1]);
		System.out.println(score[0][2]);
		System.out.println("score�� ���� ���� = " + score.length);
		System.out.println("score�� 1��° ���� ���� ����= " + score[0].length);
		System.out.println("score�� 2��° ���� ���� ����= " + score[1].length);
	
		//for������ ���ھ� ������ ���ڸ� ��� ���...
		/*0,0  0,1 0,2 
		 *1,0 1,1 1,2
		 *���� �ٱ� for ���� ���� for
		 *
		 * 
		 * */
//		
//		int i = 0;
//		int j = 0;
//		
//		for (i = 0; i<score.length; i++) {
//			for ( j = 0; j<=i; j++) {
//				
//		}
//			System.out.println(score[j][i] + " ");
//		}
	
		for (int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) { /*score�� 0,1,i �� �ȴ�;*/
				System.out.print("["+score[i][j] + "]");
			}
			System.out.println("\n");
		}
		
		//3�� 5�� �迭 ����
//		
//		int[][] arr1 = new int[3][5];
//		//random���� 1~10���� ���� �ֱ�
//		/* 0,0 0,1, 0,2 0,3
//		 * 1,0 1,1 1,2 1,3
//		 * 3,0 3,1 3,2 3,3
//		 * 
//		 * */
//		
//		for(int i = 0; i<score.length; i++) {
//			for (int j = 0; j<score[i].length; j++) {
//				arr1[i][j] = (int)(Math.random()*10) + 1;
//				System.out.println("[" + score[i][j] + "]");
//				
		System.out.println();
		
		
		int[][]	arr1 = new int[3][5];
		
		for (int i =0 ; i<arr1.length; i++) {
			for(int j=0 ; j<arr1[i].length; j++) {
				arr1[i][j]= (int)(Math.random()*10) +1	;
				System.out.print("["+ arr1[i][j] + "]");
			}
				System.out.println();
			}
			
		//�� �ึ�� ���� ������ �ٸ����...
		int[][] intArr1 = {{3,7,8},
		     			  {6},
		     		      {9,4}};
		
		for (int i=0; i<intArr1.length; i++) {
			for(int j=0; j<intArr1[i].length; j++) {
				System.out.println(intArr1[i][j]);
			}
		}
		
		
		
		
		
		
		
	}

}
