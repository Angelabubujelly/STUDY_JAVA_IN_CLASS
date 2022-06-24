package chap05_1;

public class ArrayLotto11 {

	public static void main(String[] args) {
		//1��~ 45������... ��Ʈ�뿭 45���� ���� ������� �־��ֻ�...
		// 6���� ���ڸ� ���
		//�ٵ� �����̶� ���� ���ڰ� ���ü�������..
		
		
		int lotto[] = new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
			
		}
		
		// �迭 �ȿ� 1~45���� �� �־.
		
		int tmp = 0;
		int index = 0;
		
		
		for (int i=0; i<6; i++ ) {
			index = (int)(Math.random()*45);
			tmp = lotto[i];
			lotto[i] = lotto[index];
			lotto[index] = tmp;
			
			/*1 . 2, 
			 * 2
			 * 3
			 * 4
			 * 5
			 * 6
			 * 
			 */
		}
		
		for(int i = 0; i<6; i++) {
			System.out.print(lotto[i]+ ", ");
		}
		
		
		//�ڸ��ٲ�
		


		
	}

}
