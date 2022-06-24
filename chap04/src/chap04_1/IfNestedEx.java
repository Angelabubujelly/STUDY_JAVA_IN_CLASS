package chap04_1;

public class IfNestedEx {

	public static void main(String[] args) {
		int num1 = -7;
		
		if(num1 >= 100) {
			if(num1 >= 150 ) {
				System.out.println("150보다 큰 수 입니다.");
				
				
			} else {
				System.out.println("100보다는 크고 150보다는 작은 수 입니다.");
			}
		} else {
			if(num1 < 0) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("100보다 작은 양수 입니다.");
			}

		}

	}

}
