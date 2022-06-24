package chap10;

public class NullPointerException06 {

	public static void main(String[] args) {
		try { 
		String data = null;
		System.out.println(data.toString()); //여기서 Exception 발생
		
		} catch (NullPointerException e) {
			System.out.println("데이터가 들어있지 않습니당.");
			System.out.println("예외처리 메시지 : "+ e); //예외처리 메시지 출력해쥼0
		}

		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("프로그램 끝");
	}

}
