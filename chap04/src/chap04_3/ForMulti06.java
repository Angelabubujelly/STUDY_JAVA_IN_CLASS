package chap04_3;

public class ForMulti06 {

	public static void main(String[] args) {
			for(int i = 0; i<3; i++ ){//i�� 0 1 2
				for(int j=9; j>4; j--) {//���� ������ �ٸ��� �����ؾ� ��. ���� for ���� ���� for���ȿ����� �۵��ϱ� ��������.
			System.out.println("i=" + i + ", j =" + j); 
					//j�� for���� ������ �� ������ ���� �� ���� ����� �� �ٽ� ���� for���� �۵�, �� �ٽ� ����for�� �۵�.
				}
				System.out.println(); //Enter���� ������ ���� for ������ ��� �� �ٽ� ���� for���� �ٽ� �۵��Ʊ⶧����...
				//������ for�� ���� for���� ���̸��� ���ƿ���˿��������������˿�
			}
	}

}
