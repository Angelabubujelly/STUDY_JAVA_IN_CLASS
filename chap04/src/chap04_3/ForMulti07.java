package chap04_3;

public class ForMulti07 {

	public static void main(String[] args) {
		// 2*1=2
		// 2*2=4
		/* 2*3=6
		 * 2*4=8
		 * 변하지않음 *1~9까지 나옴
		 *  9번 돌고 나면 2에 +1
		 *  3*1=3
		 * 3*2=6
		 *  int  dan = 2 ; dan <=9 ; dan++
		 */
		for (int dan = 2; dan<=9; dan++) {
			System.out.println("♥" + dan + "단 입니다♥" + "\n");
			 for (int i = 1; i<=9; i++) {
				 System.out.println(dan + " * " + i + " = " + dan*i);
			 }
			 System.out.println("\n");
		}
	}

}
