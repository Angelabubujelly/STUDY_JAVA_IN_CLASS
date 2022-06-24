package chap04_05;

public class NameOuter03 {

	public static void main(String[] args) {
		
	kim:for (int dan = 2; dan<=9; dan++) /*for문의 이름을 kim*/{
			System.out.println("♥" + dan + "단 입니다♥" + "\n");
			 for (int i = 1; i<=9; i++) {
				 System.out.println(dan + " * " + i + " = " + dan*i);
				 if(i==5)
					 break kim;
			 }
			 System.out.println("안쪽 for문 종료\n");
		}
System.out.println("바깥 for문 <kim>for문 종료");



outter:for (int dan = 2; dan<=9; dan++) /*for문의 이름을 kim*/{
	 mid:for (int i = 1; i<=9; i++) {
		 for (int z = 1; z<=5; z++) {
			 System.out.println(dan + "," + i + ", " + z);
			if(z==3)
				break outter;
		 }
		 System.out.println("안쪽 for문 종료");
	 }
	 System.out.println("중앙 for문 종료\n");
}
System.out.println("바깥 for문 <kim>for문 종료");
	}

}
