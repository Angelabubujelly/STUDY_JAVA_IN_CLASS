package chap03_2;

public class CompareString {

	public static void main(String[] args) {
		String str = "������"; //�׷���.
		String str2 = new String("������");// new �� �ݵ�� ��ü�� �����϶�� ����.
		String st3 = "������"; //���� ���ݿ�? str�� �ּҸ� st3�� �־��� ����..
		//���� ��ü�� ������ �� �̷��� �ؾ���. String �̶�� ��ü�� ����� �ž�. �ٵ� ��,... 

		
		System.out.println(str);
		System.out.println(str2);
		//������ ������ �� ������������ �ּҴ� �ٸ�!
		
		System.out.println("�� ������ �ּҰ� ������?" + (str == str2));
		//���ڿ��� �ƴ϶� �ڿ� () ������� ���ڵ� ������ �Ҹ��� �������� ����.
		//���� ������ �ƴϰ� �ּҰ� ������ ����ñ⿡ false����.
	//new ��� ���� ������� ������ ���� ���� ���� �ּҸ� ����Ű���� ��.
		System.out.println(str == st3);
		
		System.out.println("�� ������ ���� ������? " + str.equals(str2));
		
	}

}
