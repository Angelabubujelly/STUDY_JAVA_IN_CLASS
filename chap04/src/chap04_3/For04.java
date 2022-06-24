package chap04_3;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// 구구단 출력...
		// 1. 사용자로부터 몇단을 출력할 것인지 입력받음.
		//2. 입력받은 단을 출력하는 for 문
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요.: ");
		int dan =sc.nextInt();
	
	
		for(int i = 1 ; i<=9; i++) {

			
			System.out.println(dan + " * " + i + " = " + dan *i );
	
		}
			//7*1 저 숫자는 어디서 얻는걸까. 어떤 문자를 넣으면 될까 하는걸 차근차근 적어내면 된답니다..ㅎ....ㅎㅎㅎ.ㅎ.ㅎ.ㅎ.ㅎ.ㅎ.
	
		
	}

}
