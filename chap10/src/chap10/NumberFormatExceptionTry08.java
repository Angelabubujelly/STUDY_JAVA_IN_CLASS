package chap10;

public class NumberFormatExceptionTry08 {

	public static void main(String[] args) {
		int i = 0 ;
		String []	 strNum = {"23","17","abc200"};
		try {
		
			for (i= 0; i<strNum.length; i++) { 
			int num = Integer.parseInt(strNum[i]);
			System.out.println("���ڷ� ��ȯ�� ��= " + num);
			
			}
		} catch(NumberFormatException e) {
			System.out.println(strNum[i] + "�� ��ȯ�� �� ����.");
		}

		
			
		
	}

}
