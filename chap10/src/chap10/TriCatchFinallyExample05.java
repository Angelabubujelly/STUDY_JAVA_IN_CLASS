package chap10;

public class TriCatchFinallyExample05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //Exception생긴 부분부터 try끝까지는 수행 안 함
			System.out.println(4);
		} catch (Exception e) { 
			System.out.println(5);
		}	finally { //굳이 finally 하고 중괄호 할 필요는 없으~
			System.out.println(6);
	}
	}
}
