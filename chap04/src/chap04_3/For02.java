package chap04_3;

public class For02 {

	public static void main(String[] args) {

//		int sum;
//		sum = 1+2+3+4+5+6+7+8+9+10;
//		System.out.println("1~10������ �� = " + sum);
					
		int sum = 0;
		for(int num = 1; num<=10; num++) {
			sum = sum + num;
			
//			System.out.println(sum); <- 10���� ���� ��� ��µ�.
				
			
		}
		System.out.println("1~10������ ���� " + sum);
		
		//500~ 1000������ �հ�
		//sum ������ sum = 0; �ʱ�ȭ ���ּ���...
		
		int rum = 0;
		for(int num = 500; num<=1000; num++) {
			rum = rum + num;
			
			System.out.println("500~1000������ �� : " + rum);
			
		}
	
	}

}
