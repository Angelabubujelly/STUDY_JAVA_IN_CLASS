package chap05_1;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//인원은 5명, 과목은 3과목
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
//		System.out.println("번호 | 국어 | 영어 | 수학 | 총점 | 평균");
//		System.out.println("---------------------------------");
//		for (int i = 0; i<score.length; i++) {
//			int sum = 0; //sum의 위치 신경쓰삼
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
//System.out.println("총점 | " + korTotal +" | "+ engTotal +" | " + mathTotal+" | "+"   | "+"   | ");	
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
		System.out.println("번호 | 국어| 영어| 수학| 총점| 평균");
		System.out.println("---------------------------------");

		for (int i = 0; i<score.length; i++) {
			int sum = 0; //sum의 위치 신경쓰삼
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
		System.out.printf("총점 %4d %4d %4d \n", korTotal, engTotal, mathTotal);	
		System.out.println("---------------------------------");

//	System.out.printf("총점 %d %d %d\n", korTotal,engTotal,mathTotal); //자리수 맞추기 위해 사용..%d는 토탈. 
//	System.out.printf("평균 %f %f %f\n", 78.3,62.3,67.2);
//	System.out.printf("이름 %s %s %s\n", "홍길동", "이순신", "아무개");
//	System.out.printf("%5d\n", 34);
//	System.out.printf("%05d\n", 34);
//	System.out.printf("%5.2f\n", 1235.489); //전체자리수.소수점 뒤 자리
//	System.out.printf("%.2f", 34.888); //. 붙이믄 정수부분은 뭐가됐든 신경 안쓴다...
	}

}
