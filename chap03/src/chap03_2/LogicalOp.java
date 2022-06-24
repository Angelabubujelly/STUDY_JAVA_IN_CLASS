package chap03_2;

public class LogicalOp {

	public static void main(String[] args) {
		int num1 = 110;
		int num2 = 87;
		
		boolean bo = num1 <= 100	&	num2 >=0;
		//				false				true
		System.out.println(bo);
		
		
		int value = 7; 
		boolean bo2 =	value % 2 == 0	||		value % 3 == 0;
		System.out.println("2또는 3의 배수입니까? = " + bo2);

		//아스키코드에서 65~90 까지가 알파벳 대문자 , 97~122까지가 소문자
		
		
		int unicode =  'a'; //97이 소문자
		
		 bo2 = unicode >= 97	&&	unicode <= 122;
		//			 65.66.67,... 			..., 88,89, 90
		System.out.println("소문자 입니까? = " + bo2);
		
		int uni = 'A';
		
		bo2 = uni >= 65		&&	uni <= 97;
				System.out.println("대문자 입니까? = " + bo2);
	

	}

}
