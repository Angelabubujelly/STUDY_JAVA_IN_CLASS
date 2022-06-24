package chap10;

public class RunTimeException11 {

	public static void main(String[] args) {
		String data1 = null, data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("�� 2���� �Է��ϼ���");
//			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2"	);
			return; // �ϸ� �޼ҵ� ���� ��!
		}
		try {
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			int result = num1 +num2;	
			System.out.println("�� ���� �� : " + num1 + "+"+num2 + "="+result);
		
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �Ұ���");
		}
			
		

	}

}
