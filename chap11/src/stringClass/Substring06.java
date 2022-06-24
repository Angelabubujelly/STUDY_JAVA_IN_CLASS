package stringClass;

public class Substring06 {

	public static void main(String[] args) {
		String ssn = "220504-1111111";
		String subStr = ssn.substring(7);
System.out.println(subStr);

	String subStr2 = ssn.substring(0,6);
	System.out.println(subStr2);
	
	String str = "Hello.java";
	int index = str.indexOf(".");
	System.out.println(index);
	String name = str.substring(0,index);
	System.out.println("파일명 : "+ name);
	
String ext = str.substring(index+1); //?????????????????????????
System.out.println("확장자명 :" + ext);
	}

}
