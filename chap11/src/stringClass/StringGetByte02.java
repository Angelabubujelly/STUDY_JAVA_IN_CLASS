package stringClass;

import java.io.UnsupportedEncodingException;

public class StringGetByte02 {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���"; //�ѱ� 2byte��,,, 
//	String str = "abcde"; //����, Ư����ȣ 1byte�� 
		
	byte[] bytes1 = str.getBytes()	; //�����ڵ带 �а� ��ȯ�� �ؼ�,,, �Գ��Գ�
	System.out.println("bytes1.length = " +bytes1.length); 
	
	String str1 = new String(bytes1);
	System.out.println(str1);
	
	try {
		byte[] bytes2 = str.getBytes("EUC-KR");//Ȥ�� ����Ʈ�� �� �� ���� UTF-8 �� �̿��� ���ڵ� �� ���ڵ�
		 System.out.println("bytes2.length= " + bytes2.length);
		 String str2 = new String(bytes2, "EUC-KR");
		 System.out.println("bytes2 �� String : " + str2);
		 
			byte[] bytes3 = str.getBytes("UTF-8");
			 System.out.println("bytes3.length= " + bytes3.length);
			 String str3 = new String(bytes3, "UTF-8");
			 System.out.println("bytes3 �� String : " + str3);
			 
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
