package chap04_04;
import java.util.Scanner;


public class DoWhile04 {

	public static void main(String[] args) {
		boolean run = false;
	do {
		System.out.println("do~while 블비는 너무너무 사랑스러워용ㅇ용용ㅇ꺅");
		System.out.println("실행");

	} while(run); //맨 끝에는 세미콜론을 붙여줍니다... 얘는 항상 참이에용~~
	
	while(run) {
		System.out.println("while");
		System.out.println("실행");
	}
	
	Scanner scan = new Scanner(System.in);
	String str;
	do {
		

	System.out.println("메시지 입력(종료하려면 'q' 입력 ) : ");
	str = scan.nextLine(); //next는 단어 단위로 들어와용ㅇ용
	System.out.println(str);
	} while (!str.equals("q")); //! 붙이는거 열받는다... ㅡㅡ
System.out.println("프로그램 종료.");
	}
}
