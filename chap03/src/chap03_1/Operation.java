package chap03_1;

public class Operation {

	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 5;
		int result = num1 / num2;
		System.out.println(result); //���� ������ ������ ���� �� �� �� �� �� ��.
		
		result = num1 % num2;
		System.out.println(result);
		
//		double do1 = 9.242;
//		double do2 = 1.436;
//		double result1 = do1 % do2;
//		System.out.println(result1);
		
		double re = (double)num1 / num2;
		System.out.println(re); //5���� �������Ϸ��� 6 ��¼����¼��  �ϼ̴µ� �� �𸣰ڴ� ���������󤾤�
		
		

	}

}
