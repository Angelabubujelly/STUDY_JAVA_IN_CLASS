package regularPattern;

import java.util.regex.Pattern;

public class RegularPattern01 {

	public static void main(String[] args) {
		//					~���� ǥ����~
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //escape���ڶ� \�ϳ��� �ȵż� \\�����  \�� ��
		String regExp2 = "\\d{3}-\\d{3,4}-\\d{4}";

		boolean result = Pattern.matches(regExp, "010-188-0155");
		if (result) { //����� true���!
			System.out.println("���Խİ� ��ġ�մϴ�..");
		}else {
			System.out.println("���Խİ� ����ġ�մϴ�..");
			}
		
		regExp = "\\d{4}-\\d{4}";
		result = Pattern.matches(regExp, "1599-4444");
		
		if (result) { //����� true���!
			System.out.println("�����մϴ�.");
		}else {
			System.out.println("�����մϴ�.");
			}
		
		String email = "kim12@naver.co.kr";
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regExp, email);
		
		if(result)
			System.out.println("���Խİ� ��ġ");
		else 
			System.out.println("���Խİ� ����ġ");
		
	
		

		String password = "http://naver.com";
			regExp = "(http://)\\w+\\.\\w";
			
			if(result)
				System.out.println("���Խİ� ��ġ");
			else 
				System.out.println("���Խİ� ����ġ");
			

	}

}
