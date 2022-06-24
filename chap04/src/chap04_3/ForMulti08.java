package chap04_3;
import java.util.Scanner;
public class ForMulti08 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 사용자로부터 별을 몇개 출력할지 입력 받습니다. -scanner 
		 * 2. 별 출력 for 안쪽..
		 *   ☆ <- 하나찍고 엔터..
		 *   ☆☆ <-두개 찍고 엔터..
		 *   ☆☆☆
		 *   ☆☆☆☆
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("★을 몇개 출력할까요? : "); //숫자로 들어오니까 저장공간은 int형으로...
		int star =sc.nextInt();
		
		
		for(int i = 1 ; i<=star;/*사용자가 지정한 범위까지..*/ i++) {
				for(int j =1; j<=i; j++) {
					System.out.print("☆"); //prinln은 하나찍고 엔터찍게 됨.
					
			}
				System.out.println();

		 
		}
	}

}

