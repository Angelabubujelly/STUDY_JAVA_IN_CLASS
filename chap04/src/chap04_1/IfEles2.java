package chap04_1;
import java.util.Scanner;
public class IfEles2 {

	public static void main(String[] args) {
//		int num1 =78;
//		
//		if	(num1 % 2 == 1) 
//			System.out.println("홀수입니다.");
//		else// (num1 % 2 == 0)
//		System.out.println("짝수입니다.");
		
		Scanner sc1 = new Scanner(System.in);
		
//		System.out.println("이름을 넣으세요 : ");
//		String str1 = sc1.next();
//		System.out.println(str1);
//		
//		System.out.println("취미가 무엇입니까? ");
//		String hobby = sc1.next();
//		System.out.println(hobby);
		

//		System.out.println("나이를 적으세요 : ");
//		int age = sc1.nextInt();
//		System.out.println(2022-age);
		
		System.out.println("숫자를 입력하세요.");
		int num2 = sc1.nextInt();
		if(num2 % 2 ==0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
	}

}
