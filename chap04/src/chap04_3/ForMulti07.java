package chap04_3;

public class ForMulti07 {

	public static void main(String[] args) {
		// 2*1=2
		// 2*2=4
		/* 2*3=6
		 * 2*4=8
		 * ���������� *1~9���� ����
		 *  9�� ���� ���� 2�� +1
		 *  3*1=3
		 * 3*2=6
		 *  int  dan = 2 ; dan <=9 ; dan++
		 */
		for (int dan = 2; dan<=9; dan++) {
			System.out.println("��" + dan + "�� �Դϴ٢�" + "\n");
			 for (int i = 1; i<=9; i++) {
				 System.out.println(dan + " * " + i + " = " + dan*i);
			 }
			 System.out.println("\n");
		}
	}

}
