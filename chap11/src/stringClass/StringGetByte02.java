package stringClass;

import java.io.UnsupportedEncodingException;

public class StringGetByte02 {

	public static void main(String[] args) {
		String str = "안녕하세요"; //한글 2byte씩,,, 
//	String str = "abcde"; //영어, 특수기호 1byte씩 
		
	byte[] bytes1 = str.getBytes()	; //유니코드를 읽고 변환을 해서,,, 함냐함냐
	System.out.println("bytes1.length = " +bytes1.length); 
	
	String str1 = new String(bytes1);
	System.out.println(str1);
	
	try {
		byte[] bytes2 = str.getBytes("EUC-KR");//혹은 바이트가 좀 더 작은 UTF-8 를 이용해 인코딩 및 디코딩
		 System.out.println("bytes2.length= " + bytes2.length);
		 String str2 = new String(bytes2, "EUC-KR");
		 System.out.println("bytes2 ☞ String : " + str2);
		 
			byte[] bytes3 = str.getBytes("UTF-8");
			 System.out.println("bytes3.length= " + bytes3.length);
			 String str3 = new String(bytes3, "UTF-8");
			 System.out.println("bytes3 ☞ String : " + str3);
			 
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
