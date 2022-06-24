package chap05_1;

public class Array07 {

	public static void main(String[] args) {
		int[] score = {12,14,65,57,23,57,89,100,24,84};
		
		//최대값을 출력하는 프로그램
/* 10개의 숫자 중에서 가장 큰 숫자를 가려내기 위해 비교를 해야함. 
 * i = 0, 12.
 * i = 1, 14
 * i > i++
 * i0 < i1
 * i =1 과 i =2을 비교해야 함. 
 * i1 < i2
 * i= 2와 i=3 을 비교.
 * i=2> i=3
 * i2와 i=4를 비교해야 함. 
 * 
 * 
 * 
 * */
//		int i = 0;
//		for (i = 0; i<score.length;i++ ) {
//			num[i] 
//		}
		
		int max = score[0]; //= int max; max = 0은 선언 했으니까 초기값을 1부터 해도 됨.
		
				for(int i = 1; i<score.length; i++) {
					if(max < score[i]) {
						max = score[i]; //맥스에 현재 스코어값을 넣어준다...
					}
				}
System.out.println("최대값 = " + max);
				
		//==============================

//int min = score[0];
//for(int i = 1; i<score.length; i++) {
//	if(min >score[i]) {
//		min = score[i];
//	}
//}
//
//	System.out.println("최소값 = " + min);
//	}

/////////////////////////////////////////////

int min = score[0]; //= int max; max = 0은 선언 했으니까 초기값을 1부터 해도 됨.

for(int i = 1; i<score.length; i++) {
	if(max < score[i]) {
		max = score[i];
		//				max = (max<scores[i]?scores[i]:max);
	}
	if (min >score[i]) {
		min = score[i];
	}
}
System.out.println("최소값 = " + min);
System.out.println("최대값 = " + max);




	}
}
