package chap02_3;

public class TypeCasting {

	public static void main(String[] args) {
		// ���� ����ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ����� ���� �� 
		
		int i1 = 44032;
		//char ch1 = i1; //int�� 4byte�ε� char, 2byte�� �������� ������������
			char ch1 = (char)i1;
			
			System.out.println(ch1);
			System.out.println(i1);
			
			long lo1 = 450;
			//int i2 = lo1;   ---> long ���� int�� �������� ������������
			int i2 = (int)lo1;
			
			System.out.println(i2);
			
			double dou1 = 34.5678;
//			int i3 = dou1; 8byte�� 4byte�� �������� ������
			
			int i3 = (int)dou1;
			System.out.println(i3); //�Ǽ��� ������ �ٲܶ��� �Ҽ��� �ڸ��� ������ ������.
		
			
			
	}

}
