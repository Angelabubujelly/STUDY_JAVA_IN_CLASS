package stringClass;

public class ValueOf09 {

	public static void main(String[] args) {
		// ValueOf() : �ٸ� �ڷ����� String������ ����ȯ�Ҷ� ���
		
		int num1 = 10;
		double num2 = 12.345;
		
		String str1 = String.valueOf(num1);   //.valueOf�� �տ� static�پ ��ü ���� ���ϰ�... 
		String str2 = String.valueOf(num2);
		System.out.println(num1+num2);
		System.out.println(str1 + str2);
		
		boolean b = false;
		String str3 =String.valueOf(false);
		System.out.println(str3); //���� ������ false�� �ƴϰ� ���� �� �� 
		
//		if(str3) { // str3 = false�� ���ڰ� �����Ƿ�... �ν��� �� ��
			if(b) {
				
			} else {
			
			}
	
	}

}
