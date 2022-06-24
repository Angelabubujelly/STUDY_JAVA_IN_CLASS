package chap03_2;

public class CompareOper {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 50;
		boolean re = num1 == num2;
		System.out.println(re);
		
		re = num1 != num2;
		System.out.println(re);
		
		char ch1 = 'A'; //A= 65, B=66, 문자도 아스키 코드의 값을 비교 할 수 있다.
		char ch2 = 'B';
		re = ch1 < ch2;
		System.out.println(re);
		

	}

}
