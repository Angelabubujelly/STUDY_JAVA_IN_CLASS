package chap04_04;

public class Break01_mine {

	public static void main(String[] args) {
		/*
		1~100합계 구하는 for문을 만들고
		합계에 들어있는 값이 2500이상이 됐을 때 for문을 종료
		*/

		int sum = 0;
		int i;
		for (i =1; i<=100 ; i++ ) {
			sum +=i;
			
			if (sum >= 2500)
				break;
		}

		System.out.println("합계 = " + sum + ", 합이 2500이 넘는 위치는 = " + i);
		
		
		
	}

}
