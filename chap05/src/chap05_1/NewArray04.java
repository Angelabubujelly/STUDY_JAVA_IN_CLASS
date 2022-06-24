package chap05_1;

public class NewArray04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		int sc[] = new int[10];
		double dou[]= new double[3];
		int k = 1;	
		
		score[0] = 10;
		score[1] = 78;
		score[k+1] =100; /*k +1 =2 *///인덱스2번에 100을 넣으라는 소리.
		score[3] = 100;
		score[4] = 98;

		
		System.out.println(dou[1]); //int 형에 초기값 설정을 안 하면 0이라는 기본 자료형이 나옴. 더블은 0.0이 기본 자료형
		
		int tmp = score[1] + score[4];
		
		System.out.println(tmp);
		System.out.println(score[2]);
	}

}
