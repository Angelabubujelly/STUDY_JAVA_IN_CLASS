package chap05_1;

import java.util.Scanner;

public class Exercise077 {

	public static void main(String[] args) {
		// exercise7
		// 주어진 배열의 항목에서 초ㅣ대값을 구해보세용
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
		//주어진 배열의 전체 항목의 합과 평균값을 구하세요. (for문)
		
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
		/*다음은 키보드로부터 학생 수와 학생들의 점수를 입력받아서, 최고점수
		 * 및 평균 점수를 구하는 푸로그램임돠. 실행결과를 보고 작성해슈
		 * (참고로 스캐너는 콘솔에 입력된 숫자를 읽고 리턴함다.
		 * 
		 * */
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		

		
		Scanner scanner = new Scanner(System.in);
		
	while(run) {
		System.out.println("-------------");
		System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("-------------");
		System.out.println("선택> ");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
		System.out.println("학생수> ");
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
			System.out.println("최고 점수: " + max);
			System.out.println("평균 점수: " + avr);
			//작성 위치
		} else if (selectNo == 5 ) {
			run = false;
		}
	}
	
	System.out.println("프로그램 종료.");
	}
}

