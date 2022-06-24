package chap10;

import java.util.Scanner;

public class MultiCatchEx12 {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2= args[1];
			
	
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			System.out.println("두수의 몫은? = " + (num1 / num2));
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가능"); //integer로 변환이 안될때..
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자를 2개 넣어야 합니다.");
		}catch(Exception e) { // 상위 2개를 제외한 모든 예외는 일루왕!.. 0넣으면 0으로 나눌 수 없기에 예외 발생~
			System.out.println("예외 발생");
			
		}

	}

}
