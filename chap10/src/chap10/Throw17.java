package chap10;

public class Throw17 {

	public static void main(String[] args) {
		try {
		Exception e = new Exception("���Ƿ� ���� �߻�"); //��Ʈ�� �ϳ� �־�����
		throw e; //���Ƿ� ���� �߻� ��Ŵ!
	} catch (Exception e) {
	System.out.println("���� �޽��� :" + e.getMessage());	 //��.getMessage() �� ������ ������ �����ϰ� ���
	}
	try {
		findClass();
	} catch (ClassNotFoundException e) {
		System.out.println("Ŭ������ �������� ����");
	}
	System.out.println("���α׷� ���� ����");
}
	//main method������ �ٸ� method �ϳ� ������
	
	public static void findClass() throws ClassNotFoundException /*�� ���� ���ѱ��...*/{
	
		Class class01 = Class.forName("java.lang.String5"); //��.forName..���� ��������شٰ�..?

	}
	
}
