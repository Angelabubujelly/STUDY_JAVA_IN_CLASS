package chap04_04;
import java.util.Scanner;
public class Wile03SAnswer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("점수 입력(끝내려면 -1입력) : ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 90)
			System.out.println("A학점");
		else if(jumsu >= 80)
			System.out.println("B학점");
		else if(jumsu >= 70)
			System.out.println("C학점");
		else if(jumsu >= 60)
			System.out.println("D학점");
		else if(jumsu >= 0)
			System.out.println("F학점");
		else if(jumsu == -1)
			break;
	
		}
		System.out.println("프로그램 종료");
	}

}
