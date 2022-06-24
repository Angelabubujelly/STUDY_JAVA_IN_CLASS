package regularPattern;

import java.util.regex.Pattern;

public class RegularPattern01 {

	public static void main(String[] args) {
		//					~정규 표현식~
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //escape문자라 \하나면 안돼서 \\해줘야  \로 앎
		String regExp2 = "\\d{3}-\\d{3,4}-\\d{4}";

		boolean result = Pattern.matches(regExp, "010-188-0155");
		if (result) { //결과가 true라면!
			System.out.println("정규식과 일치합니다..");
		}else {
			System.out.println("정규식과 불일치합니다..");
			}
		
		regExp = "\\d{4}-\\d{4}";
		result = Pattern.matches(regExp, "1599-4444");
		
		if (result) { //결과가 true라면!
			System.out.println("차단합니다.");
		}else {
			System.out.println("수신합니다.");
			}
		
		String email = "kim12@naver.co.kr";
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regExp, email);
		
		if(result)
			System.out.println("정규식과 일치");
		else 
			System.out.println("정규식과 불일치");
		
	
		

		String password = "http://naver.com";
			regExp = "(http://)\\w+\\.\\w";
			
			if(result)
				System.out.println("정규식과 일치");
			else 
				System.out.println("정규식과 불일치");
			

	}

}
