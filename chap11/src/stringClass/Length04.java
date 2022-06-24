package stringClass;

public class Length04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "1234567890123";
		int length = ssn.length(); //length 걔는 변수,,, 얘는 메소드,,
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else 
			System.out.println("주민번호 자리수가 맞지 않습니다.");
	}

}
