package chap10;

public class Throw17 {

	public static void main(String[] args) {
		try {
		Exception e = new Exception("고의로 예외 발생"); //스트링 하나 넣었수다
		throw e; //고의로 예외 발생 시킴!
	} catch (Exception e) {
	System.out.println("에러 메시지 :" + e.getMessage());	 //♡.getMessage() ☜ 에러의 원인을 간단하게 출력
	}
	try {
		findClass();
	} catch (ClassNotFoundException e) {
		System.out.println("클래스가 존재하지 않음");
	}
	System.out.println("프로그램 정상 종료");
}
	//main method끝나고 다른 method 하나 넣을게
	
	public static void findClass() throws ClassNotFoundException /*☜ 예외 떠넘길게...*/{
	
		Class class01 = Class.forName("java.lang.String5"); //♡.forName..값을 갖ㅈ고와준다고..?

	}
	
}
