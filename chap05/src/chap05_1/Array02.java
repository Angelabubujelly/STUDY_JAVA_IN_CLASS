package chap05_1;

public class Array02 {

	public static void main(String[] args) {
		int [] arrInt = {1, 2, 3, 4, 5};
		int arrInt2[] = {1,2,3,4,5};
		double [] arrdou1 = {3.1, 5.78, 0.123};
		double arrdou2[] = {3.1,5.78,0.123};
		boolean bool[] = {true, true, false, true, false};
		String str[] = {"¹ãºíºñ", "ºíºñÂ¯", "ºíºñ¾Ö±â"};
		char ch[] = { 'k', '¹ã', 'ºí', 'ºñ', '¾Ö','±â', '^', '@'};
		
		System.out.println(arrInt[2]);
		System.out.println(str[2]);
		System.out.println(arrdou1[1]);
		System.out.println(bool[4]);
		System.out.println();

		arrInt[2] = 10;
		
		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[2]);
		System.out.println(arrInt[3]);
		System.out.println(arrInt[4]);
		
		str[1] =	"±èÁß°æ";
		System.out.println(str[1]);
		
	}

}
