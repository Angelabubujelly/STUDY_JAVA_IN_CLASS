package chap06_1;

public class MainClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int value = 52;
		String name = "������";
		System.out.println(value);
		System.out.println(name);
//���� Ŭ������ ���� �̸��� ���Ƶ� ���� ���� ���� �� ���� Ŭ������ �����ϱ� ����.
		
		naemaumdaero aa = new naemaumdaero(); //���� aa�� ���ÿ� ���� ��. ��ü�� �����ϰ� aa��  naemaumdaero�� ��������� ����. ??
		System.out.println("\n" + "naemaumdaeroŬ���� value�� ���� : " + aa.value); //aa�� value���� ã�Ƽ� ����϶�� ��
		System.out.println("naemaumdaeroŬ���� name�� ���� : " + aa.name + "\n");

		B1 bb = new B1();
		int bValue = bb.value; // ������ ������� �����ͼ� bVlaue������ �־��ݴϴ�.
		String bName = bb.name;
		
		    System.out.println("b1Ŭ������ value�Ǻ��� : " +bValue);
			System.out.println("b1Ŭ������ name�Ǻ��� : " + bName);
			
	
			
	}

}

//������ �޼ҵ尡 ���� �� = ���̺귯�� = API = �� ȥ�ڼ� ���� �� �� ���� ��.
//�� Ŭ���� ģ���� �������Դϴ�.
//���� �޼ҵ尡 ��� ��¹� ��뵵 �� �� �� �� �� . �ֳĸ� �� ȥ�ڴ� run�� �� �� ���� ��������..

class naemaumdaero {
	int value = 5252;
	String name = "����Ѵ���";
	
}