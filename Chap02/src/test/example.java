package test;

public class example {

	public static void main(String[] args) {

		// 변수 3개 만들기
		// 첫번째 변수를 만들어 숫자 넣기
		// 두번째 변수를 만들어 숫자 넣기
		// 세번째 변수를 만들어 첫번째 변수와 두번째 변수를 더한 결과를 넣기
		// 세번째 변수출력 (출력문의 예 : 13 + 4 = 17)
		// 세번째 변수에 첫번째 변수에서 10을 빼서 넣기 13- 10
		// 세번째 변수 출력
		//세번째 변수에 두번째 변수에서 3을 곱해서 넣기 4 *3
		//세번째 변수 출력

				int first = 13;
				int second = 4;
				int third = -10;
				int result = first + second;
				int result2 = first + second + third;
				
				/*
				 * System.out.println("연산결과 =" + result); System.out.println("  = " + (result
				 * -10) ); int result2 = 7; System.out.println("=" + (result2 * 3));
				 */
				
				System.out.println(first + "+" + second + "=" + result);
				System.out.println(result  + -10 + "=" + result2);
				
				result = first - 10;
				System.out.println(first + "-10 =" + result);
				
				result = second + 3;
				System.out.println(second + "*3="+ result);
				
	}
				
}
