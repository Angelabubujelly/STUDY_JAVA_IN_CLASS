package chap03_1;

public class AccuracyEx {

	public static void main(String[] args) {
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple - (number*pieceUnit); //더블은 부동소수점으로 나 갑 니 다
//		System.out.println("사과 한 개에서 0.7조각을 빼면, " + result + "조각이 남는다.");

		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;	
	
		double result = temp / 10.0;
//    = double result = (double)temp / 10;
		
		System.out.println("사과 한 개에서 0.7조각을 빼면, " + result + "조각이 남는다. ");
		
		
		
	}

}
