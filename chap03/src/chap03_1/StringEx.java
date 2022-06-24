package chap03_1;

public class StringEx {

	public static void main(String[] args) {
		
		String str = "java" + 8 + 9; //String 자체가 문자열이여. 문자로 인식해서 숫자가 바로 문자로 출력됨
		System.out.println(str);

		str = "java" + ( 8 + 9); //문자로 시작한 것은 뒤에 오는 모든걸 문자로 인식. 괄호를 넣어주면 숫자로 인식.
		System.out.println(str);
		
		str = 3 + 3.0 + "java" + 9 + 5;
		System.out.println(str);
		
		
	}

}
