package chap10;

public class TriCatchFinallyExample05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //Exception���� �κк��� try�������� ���� �� ��
			System.out.println(4);
		} catch (Exception e) { 
			System.out.println(5);
		}	finally { //���� finally �ϰ� �߰�ȣ �� �ʿ�� ����~
			System.out.println(6);
	}
	}
}
