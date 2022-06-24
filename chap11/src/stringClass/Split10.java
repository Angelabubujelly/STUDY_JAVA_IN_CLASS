package stringClass;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Split10 {

	public static void main(String[] args) {
		//String 클래스의 split()메소드 사용
		String str = "아테네/잔느/이순신/강감찬/밤블비";
		String[]	 names = str.split("/");
		System.out.println(Arrays.toString(names)); //arrays.tostring 호출 하는거 부터가 걍 오버라이딩까지 해주는겨

String str2 = "아테네/잔느,이순신-강감찬,밤블비";
String[]	names2 = str2.split("/|,|-");
	System.out.println(Arrays.toString(names2));
	System.out.println(names2[3]);
	
	//StringTokenizer클래스는 object가 아니고 util에 있어서 객체생성 해줘야 함.
	StringTokenizer st = new StringTokenizer(str2, "/|,|-");
	System.out.println("남아있는 토큰의 수 : " +st.countTokens());
	int length = st.countTokens();
	for (int i = 0; i<length; i++) {
//		System.out.print( st.nextToken() +", ");
	} System.out.println();
	while(st.hasMoreTokens()) { //남아있는 토큰 꺼내는거~~~~ 
		System.out.print(st.nextToken() + ", ");
	}
	}

}
