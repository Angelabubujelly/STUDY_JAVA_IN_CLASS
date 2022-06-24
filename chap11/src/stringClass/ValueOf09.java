package stringClass;

public class ValueOf09 {

	public static void main(String[] args) {
		// ValueOf() : 다른 자료형을 String형으로 형변환할때 사용
		
		int num1 = 10;
		double num2 = 12.345;
		
		String str1 = String.valueOf(num1);   //.valueOf는 앞에 static붙어서 객체 생성 안하고... 
		String str2 = String.valueOf(num2);
		System.out.println(num1+num2);
		System.out.println(str1 + str2);
		
		boolean b = false;
		String str3 =String.valueOf(false);
		System.out.println(str3); //논리로 따지면 false가 아니고 그저 문 자 
		
//		if(str3) { // str3 = false가 문자가 됐으므로... 인식이 안 됨
			if(b) {
				
			} else {
			
			}
	
	}

}
