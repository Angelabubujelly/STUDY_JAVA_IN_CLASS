package total;

public class TotalEx {

	public static void main(String[] args) {

		//���� : ��������� ������
		//���ͷ� : ������ �����ϸ鼭 �ٷ� ���� �ִ� ��
		// ���� 1��
		
		char char1 = '&'; 
		char char2 =  'a' + 2; 
		System.out.println(char2);

		// char char3 = char1 + 5;   --->���� ����ȯ �ż� int���� �� ������. "����� ������ int������ ����ȯ�� ��"
		
		//������
		int num1 = 89;
		int num2 = 5;
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
		result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result + " : �� ����"); //�Ҽ��� ���� �� ����
		
		double result2 = (double)num1 / num2; //�� + .0 �����⿡ �� �� �ϳ��� ������ �ٿ���
		System.out.println(num1 + " / " + num2 + " = " + result2);
		
		
		// �������� Long���� �ݵ�� �ڿ� L�� �ٿ��� �Ѵ�.
		long long1 = 1234567890230492304L;
		
		
		//�Ǽ���
		//float�� �ݵ�� �ڿ� f�� ���δ�. �Ҽ��� ���� 6�ڸ����� ��Ȯ��
		float float1 = 12.3456F;
		
		//double��
		//double���� �Ҽ��� ���� 15�ڸ����� �� Ȯ ��
		double double1 = 12.34567893522141242412412421434634634634346;
		
		
		//����ȯ
		//�ڵ�����ȯ : ���� �ڷ����� ū �ڷ����� ���� �� 
		byte byte1 = 17;
		int i1 = byte1;
		char ch1 = 'a'; //a = 97
		int i2 = ch1;
		double dou1 = i2;
		
		System.out.println(dou1);
		
		
		// ������. �� �� �� �� ȯ  : ū �ڷ����� ���� �ڷ����� ���� ��
		long lo1 = 198L;
		int i3 = (int)lo1;
		double dou2 = 9.3848;
		float fl1 = (float)dou2;
		
		System.out.println(i3);
		System.out.println(fl1);
		
		//����� ����ȯ <------------- ������ �Ӹ� �����ؼ� ���� �Ұ� ������������
		// int������ ���� ��(byte, short, char, int)���� ������ �� ������ int������ ��ȯ ��.
		byte b1 = 13;
		byte b2 = 5;
		//byte b3 = b1 * b2;
		int re = b1 * b2; 
		
		// ū �ڷ����� ���� �ڷ����� ������ ���� ������ ū �ڷ������� �ڵ�����ȯ
			int n1  = 36;
			long lon1 = 38L; //L�� ���̸� int ���̾��
			//int re2 = n1 + (int)lon1; long������ �ڵ�����ȯ
			int re2 = n1 + (int)lon1; //long���� ������ int������ ��ȯ�Ͽ� int+int=int ������ ...
			long re3 = n1 + lon1; // int + long = long ---->�׾߸��� �ڵ�����ȯ
			
			byte bv = 10;
			float fv = 2.5F;
			double dv = 2.5;
			char cv = 'a';
			
		  
		
		
		
		
	
	}

}
