package chap10;

import java.util.Scanner;

public class MultiCatchEx12 {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2= args[1];
			
	
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			System.out.println("�μ��� ����? = " + (num1 / num2));
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �Ұ���"); //integer�� ��ȯ�� �ȵɶ�..
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ڸ� 2�� �־�� �մϴ�.");
		}catch(Exception e) { // ���� 2���� ������ ��� ���ܴ� �Ϸ��!.. 0������ 0���� ���� �� ���⿡ ���� �߻�~
			System.out.println("���� �߻�");
			
		}

	}

}
