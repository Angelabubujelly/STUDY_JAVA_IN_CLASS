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
		System.out.println("2�Ǵ� 3�� ����Դϱ�? = " + bo2);

		//�ƽ�Ű�ڵ忡�� 65~90 ������ ���ĺ� �빮�� , 97~122������ �ҹ���
		
		
		int unicode =  'a'; //97�� �ҹ���
		
		 bo2 = unicode >= 97	&&	unicode <= 122;
		//			 65.66.67,... 			..., 88,89, 90
		System.out.println("�ҹ��� �Դϱ�? = " + bo2);
		
		int uni = 'A';
		
		bo2 = uni >= 65		&&	uni <= 97;
				System.out.println("�빮�� �Դϱ�? = " + bo2);
	

	}

}
