package chap02_2;

public class LongEx {

	public static void main(String[] args) {
		//자료형의 최소값과 최대값 알아보기
		System.out.println("int : "+ Integer.MIN_VALUE + " ~ "+ Integer.MAX_VALUE); //I대문자면 
		System.out.println("long : "+ Long.MIN_VALUE + " ~ "+ Long.MAX_VALUE);
		
		long var1 =	10; //기본적인 int로 인식, 4byte.
		// long car2 = 12147483647; 기본값인 int형으로 12147483647을 인식함. 최대 크기보다 커서 에러 발생
		long var2 = 12147483647L; // L넣어주면 int형 아니라 Long형으로 인식되기에 훨씬 큰 값도 돌아간다.
		
		System.out.println(var1);
		System.out.println(var2);
		

	}

}
