package chap03_2;

public class CompareOper {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 50;
		boolean re = num1 == num2;
		System.out.println(re);
		
		re = num1 != num2;
		System.out.println(re);
		
		char ch1 = 'A'; //A= 65, B=66, ���ڵ� �ƽ�Ű �ڵ��� ���� �� �� �� �ִ�.
		char ch2 = 'B';
		re = ch1 < ch2;
		System.out.println(re);
		

	}

}
