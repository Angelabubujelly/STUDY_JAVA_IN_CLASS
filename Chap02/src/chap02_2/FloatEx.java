package chap02_2;

public class FloatEx {

	public static void main(String[] args) {

			float flo1 = 0.123f;
			//float�� �׳� ���� double�� �ν���. 8����Ʈ�� 4����Ʈ�� ���� �� ���⿡ ��������
			//��, �⺻�ڷ����� double�� �ν� -> Error
			// ���� ���̴� �Ҽ��� ���° �ڸ����� �ν��ϰ� �ϴ��Ŀ� �޷��ִ�.
			//float�� 6�ڸ������� ��Ȯ�ؼ� double�� ���� �Ҹ�Ȯ]
			//��, �Ҽ��� ���� 6�ڸ������� ��Ȯ�� vs �Ҽ������� float �� �̻� ��Ȯ���� ���� �� ���
			
			
			float flo2 = -3.14F;
			
			double dou1 = 3.4567;
			
			float flo3 = 0.1234567890123456f;
			double dou2 = 0.1234567890123456;
			System.out.println("float = " + flo3);
			System.out.println("double = " + dou2);

	}

}
