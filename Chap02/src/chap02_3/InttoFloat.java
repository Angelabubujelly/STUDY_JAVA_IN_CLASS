package chap02_3;

public class InttoFloat {

	public static void main(String[] args) {

		// ��������ȯ �� ���е� �ս��� ���� �� �ִ�.
		
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		float num3 = num2; //float �� �� ������ ������ ����� 6��° �ڸ������� �����ϱ⿡ �� ���ĺ���.,, ��� X
		//int num4 = num3; ��������...
		int num4 = (int)num3;
		int result = num2 - num4;
		
		System.out.println(result);
		
		System.out.println(num4);

	}

}
