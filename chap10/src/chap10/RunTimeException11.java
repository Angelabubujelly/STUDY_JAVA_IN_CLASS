package chap10;

public class RunTimeException11 {

	public static void main(String[] args) {
		String data1 = null, data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("값 2개를 입력하세용");
//			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2"	);
			return; // 하면 메소드 완전 끝!
		}
		try {
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			int result = num1 +num2;	
			System.out.println("두 수의 합 : " + num1 + "+"+num2 + "="+result);
		
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 불가능");
		}
			
		

	}

}
