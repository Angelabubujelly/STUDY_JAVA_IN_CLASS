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
		System.out.println("-------------------------��");
		
		//������ �� �� �� �� �� �� �� �� . . . 
		
		y = 10; //�ٽ� �����, �ʱ�ȭ ��Ű�°ž�
		z = 10; //            "
		re3 = ++y + ++z;  //�ٸ� �����ڵ麸�� �켱 ������ ���� ++�� ���³� ���� ��� ���ְ� ������.
		System.out.println("y = " + y + ", z = "+ z);
				System.out.println("++y + ++z = " + re3);
				
				y= 10;
				z= 10;
				re3 = y++ + z++;
				// 20 = 10 + 10 ------> ++�� �ڿ� ������ ������ �����ϱ� ���߿� ++����
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
