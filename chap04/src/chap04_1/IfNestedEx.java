package chap04_1;

public class IfNestedEx {

	public static void main(String[] args) {
		int num1 = -7;
		
		if(num1 >= 100) {
			if(num1 >= 150 ) {
				System.out.println("150���� ū �� �Դϴ�.");
				
				
			} else {
				System.out.println("100���ٴ� ũ�� 150���ٴ� ���� �� �Դϴ�.");
			}
		} else {
			if(num1 < 0) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("100���� ���� ��� �Դϴ�.");
			}

		}

	}

}
