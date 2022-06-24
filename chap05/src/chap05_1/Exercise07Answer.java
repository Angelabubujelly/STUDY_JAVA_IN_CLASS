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
			/*다음은 키보드로부터 학생 수와 학생들의 점수를 입력받아서, 최고점수
			 * 및 평균 점수를 구하는 푸로그램임돠. 실행결과를 보고 작성해슈
			 * (참고로 스캐너는 콘솔에 입력된 숫자를 읽고 리턴함다.
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
//		System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
//		System.out.println("-------------");
//		System.out.println("선택> ");
//		
//		int selectNo = scanner.nextInt();
//		
//		if(selectNo == 1)
//			System.out.println("학생수> ");
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
//			System.out.println("최고 점수: " + max1);
//			System.out.println("평균 점수: " + (double)hap/studentNum);
//			System.out.println("평균 점수 : %.2f\n", (double)hap/studentNum); <- 저 퍼센트넘 쓸라믄 콤마쓰셈                                                                                                              
//		}
//			
	
	}

}
