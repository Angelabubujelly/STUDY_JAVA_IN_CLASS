package stringBuffer;

public class Append02 {

	public static void main(String[] args) {
		//append() : 뒤에 다른 문자열 추가해주는 메소드~!
		StringBuffer sb = new StringBuffer("abc");
//		StringBuffer sb2 = sb.append("def");
		System.out.println(sb.append("def"));
		System.out.println(sb); //append 해줘서 def추가된 채로 문자열로 출력
		System.out.println(sb.append(false));
		System.out.println(sb);
		System.out.println(sb.length());
		

	}

}
