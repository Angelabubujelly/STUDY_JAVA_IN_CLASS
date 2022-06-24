package chap04_3;

public class ForEx05 {

	public static void main(String[] args) {
		// 1~100까지 4의 배수의 합
		
		int sum = 0;
		int count = -1;
		for(int i=0; i<=100; i+=4) {
				sum += i;
				count++;
			
		}
		
		System.out.println("1~100까지 4의 배수의 합 =" + sum);
		System.out.println("4의 배수의 개수 = " + count);
		
		
		///밑의 경우를 훨 씬 많이 씁 니 다 .........
		
		
		sum = 0;
		count = 0;
		for (int i=1; i<=100; i++) {
			if(i%4 == 0) {
				
				sum += i;
				count++;
		}
		
		}
		System.out.println("1~100까지 4의 배수의 합 = " + sum);
		System.out.println("4의 배수의 개수 = " + count);

		sum = 0;
		int i;
		for ( i=1; i<=100; i++) {
			sum += i;
		
		}
		System.out.println("1~100까지의 합 = " + sum);
		System.out.println("갯수 = " + (i-1));
		
		//일단 i출력해주려면 for문 밖에서 일단 int i;를 선언해야만 가능해.
		//i가 101이 되면 거짓이 되기때문에 그 때 for문에서 빠져나와 101을 나타낸다. 메모리 구조와 연관이 돼서 복잡허긴 헌데..
		//괄호 안과 밖에서의 기능이 천지차이라는것만 일단 알고 갑쉬당당~~~ -1해주는 것도 거짓이 됐을 그 때의 것을 취소시키는거라 -1해주는겨
	}

}
