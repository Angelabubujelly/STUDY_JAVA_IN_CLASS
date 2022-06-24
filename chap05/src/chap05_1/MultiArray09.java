package chap05_1;

public class MultiArray09 {

	public static void main(String[] args) {
		int[][] score = {{3,7,8}, /* int[2][3]*/
				     	{9,4,2}};

		System.out.println(score[1][1]);
		System.out.println(score[0][2]);
		System.out.println("score의 행의 길이 = " + score.length);
		System.out.println("score의 1번째 행의 열의 길이= " + score[0].length);
		System.out.println("score의 2번째 행의 열의 길이= " + score[1].length);
	
		//for문으로 스코어 내부의 숫자를 모두 출력...
		/*0,0  0,1 0,2 
		 *1,0 1,1 1,2
		 *열이 바깥 for 행이 안쪽 for
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
			for(int j = 0; j<score[i].length; j++) { /*score에 0,1,i 다 된대;*/
				System.out.print("["+score[i][j] + "]");
			}
			System.out.println("\n");
		}
		
		//3행 5열 배열 생성
//		
//		int[][] arr1 = new int[3][5];
//		//random으로 1~10까지 숫자 넣기
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
			
		//각 행마다 열의 개수가 다를경우...
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
