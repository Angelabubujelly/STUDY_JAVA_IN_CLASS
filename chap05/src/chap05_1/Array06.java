package chap05_1;

public class Array06 {

	public static void main(String[] args) {
		int[] score = {40,97,98,99,100};

		//총점
		//평균 출력하세용용ㅇ구리용 소수점 이하까지 나오게 하려면 double사용...
//		int sum = 0;
//		for (int i = 0 ; i<=4; i++) {
//			sum += score[i];
//			
//		}
//		
//		System.out.println("총점은 = " + sum);
//		System.out.println(sum/i);

		int sum = 0;
		for (int i = 0; i<score.length; i++) { //이게 오ㅐ 작아야 하는거지? i가???? 길이보다 번호는 1작으니까!!!!!!
			sum += score[i];
		}
		System.out.println("합계 = " + sum);
		double average = (double)sum / score.length;
		System.out.println("평균은 =" + average);
		
	}

}
