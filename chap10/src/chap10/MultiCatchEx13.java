package chap10;

import java.util.Scanner;

public class MultiCatchEx13 {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2= args[1];
			
	
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			System.out.println("�μ��� ����? = " + (num1 / num2));
		  //integer�� ��ȯ�� �ȵɶ�..
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("�Ű� ������ �����ϰų� ����"
					+ "�� ��ȯ�� �� �����ϴ�..");
		}catch(Exception e) { // ���� 2���� ������ ��� ���ܴ� �Ϸ��!.. 0������ 0���� ���� �� ���⿡ ���� �߻�~
			System.out.println("���� �߻�");
			
		}

	}

}
