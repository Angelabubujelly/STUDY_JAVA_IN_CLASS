package stringClass;

public class Replace05 {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "dochi");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String newStr2 = oldStr.replaceFirst("자바", "java"); //첫 단어만 바꿔줌
		System.out.println(newStr2);

	}

}
