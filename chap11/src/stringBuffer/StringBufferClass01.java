package stringBuffer;

public class StringBufferClass01 {

	public static void main(String[] args) {
		//equals overrinding 하지 않 았 다.
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb == sb2);
		 
		//object class의 equals() 메소드를 호출, 주소를 비교함. 오버라이딩 ㄴㄴ
		System.out.println(sb.equals(sb2));

	}

}
