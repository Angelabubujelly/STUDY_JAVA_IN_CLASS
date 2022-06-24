package chap05_1;

public class ArrayLotto11 {

	public static void main(String[] args) {
		//1번~ 45번까지... 인트대열 45개를 만들어서 순서대로 넣어주삼...
		// 6개의 숫자를 골라냄
		//근데 랜덤이라 같은 숫자가 나올수도있음..
		
		
		int lotto[] = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
			
		}
		
		// 배열 안에 1~45까지 다 넣어봄.
		
		int tmp = 0;
		int index = 0;
		
		
		for (int i=0; i<6; i++ ) {
			index = (int)(Math.random()*45);
			tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
			
			/*1 . 2, 
			 * 2
			 * 3
			 * 4
			 * 5
			 * 6
			 * 
			 */
		}
		
		for(int i = 0; i<6; i++) {
			System.out.print(lotto[i]+ ", ");
		}
		
		
		//자리바꿈
		


		
	}

}
