package chap10;

public class NullPointerException06 {

	public static void main(String[] args) {
		try { 
		String data = null;
		System.out.println(data.toString()); //���⼭ Exception �߻�
		
		} catch (NullPointerException e) {
			System.out.println("�����Ͱ� ������� �ʽ��ϴ�.");
			System.out.println("����ó�� �޽��� : "+ e); //����ó�� �޽��� �������0
		}

		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("���α׷� ��");
	}

}
