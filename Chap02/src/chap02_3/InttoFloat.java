package chap02_3;

public class InttoFloat {

	public static void main(String[] args) {

		// 강제형변환 시 정밀도 손실이 있을 수 있다.
		
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		float num3 = num2; //float 할 때 지수부 가수부 나뉘어서 6번째 자리까지만 정밀하기에 그 이후부턴.,, 장담 X
		//int num4 = num3; 에러나용...
		int num4 = (int)num3;
		int result = num2 - num4;
		
		System.out.println(result);
		
		System.out.println(num4);

	}

}
