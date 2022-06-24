package chap03_1;

public class DenyLogicOper {

	public static void main(String[] args) {
		boolean bool1 = true;
		boolean bool2 =!bool1;
		
		System.out.println(bool1);
		System.out.println(bool2);

		bool1 = 3 >= 8;
		bool2 = !bool1;
		System.out.println(bool1);
		System.out.println(bool2);
		
		
	}

}
