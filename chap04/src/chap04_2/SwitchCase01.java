package chap04_2;

public class SwitchCase01 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6);
		
		switch (num) { //�ݵ�� ��ȣ ����~~
		case 1: //:������ �ڿ��� ������� case 1�� 1���� ��.
		System.out.println("1�Դϴ�.");
		break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
		break;
		default:
			System.out.println("5�Դϴ�.");
		}

	}

}
