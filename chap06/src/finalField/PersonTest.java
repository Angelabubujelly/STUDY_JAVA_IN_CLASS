package finalField;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person ("123456-123456", "동길홍");
		System.out.println(p1.NATION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);
		
		//상수 NATION과 SSN는 값을 바꿀 수 없어.
		p1.name = "밤블비";
		System.out.println(p1.name);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
/////////////////////////////////////////////////////////
		
		final double PI = 3.141592;
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요. : ");
		int radius =sc.nextInt();
		
		
		System.out.println("원의 면적은 " + radius*radius*PI + "입니다.");
		
		/*System.out.println("int : "+ Integer.MIN_VALUE + " ~ "+ Integer.MAX_VALUE); //I대문자면 
		System.out.println("long : "+ Long.MIN_VALUE + " ~ "+ Long.MAX_VALUE);
		 저넘들도 상수인거여... 한번 들어가면 변경되지 않는 값인겨...
		*
		*/
	}

}
