package chap10;

public class TriCatchFinallyExample04 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) { // Exception없어서 5는 안 나와용
			System.out.println(5);
		}
System.out.println(6);
	}

}
