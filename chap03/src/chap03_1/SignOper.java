package chap03_1;

public class SignOper {

	public static void main(String[] args) {
		int x = -200;
		int re1 = +x;
		int re2 = -x;
		System.out.println("+x =" + re1);
		System.out.println("-x =" + re2);
	
		int y = 10;
		int z = 10;
		int re3;
		
		y++;
		System.out.println("y++ = " + y);
		++y;
		System.out.println("++y = " + y);
		
		z--;
		System.out.println("z-- = " + z);
		--z;
		System.out.println("--z = " + z);
		System.out.println("-------------------------힝");
		
		//문제는 연 산 할 때 시 작 된 다 . . . 
		
		y = 10; //다시 덮어쓰기, 초기화 시키는거얌
		z = 10; //            "
		re3 = ++y + ++z;  //다른 연산자들보다 우선 순위가 높은 ++은 ㅇㅒ네 먼저 계산 해주고 연산함.
		System.out.println("y = " + y + ", z = "+ z);
				System.out.println("++y + ++z = " + re3);
				
				y= 10;
				z= 10;
				re3 = y++ + z++;
				// 20 = 10 + 10 ------> ++이 뒤에 붙으면 연산을 먼저하구 나중에 ++붙음
				System.out.println(" ");
				System.out.println("y = " + y + ", z = "+ z);
				System.out.println("y++ + z++ = " +re3 +'\n');
				
		
				y= 10;
				z= 10;
				re3 = y++ + ++z;
				
				System.out.println("y = " + y + ", z = " + z);
				System.out.println("y++ + ++z = " + re3 +'\n');

				y= 10;
				z= 10;
				re3 = --y + z--;
				
				System.out.println("--y + z-- = " + re3 +'\n');
				
				
				 x = 10;
				 y = 10;
				 z = 10;
				 re3 = ++x + y-- + z++; //11 10 10
				System.out.println(re3);
				
	}

}
