package chap03_1;

public class AccuracyEx {

	public static void main(String[] args) {
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple - (number*pieceUnit); //������ �ε��Ҽ������� �� �� �� ��
//		System.out.println("��� �� ������ 0.7������ ����, " + result + "������ ���´�.");

		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;	
	
		double result = temp / 10.0;
//    = double result = (double)temp / 10;
		
		System.out.println("��� �� ������ 0.7������ ����, " + result + "������ ���´�. ");
		
		
		
	}

}
