package chap04_3;

public class ForEx03 {

	public static void main(String[] args) {
		//1~100���� Ȧ���� �� ���ϱ�
		
		int odd = 0;
		for(int i = 1; i<=100; i += 2) {
			odd += i;
		
			
			
		}
		
		System.out.println("1~100���� Ȧ���� �� = " + odd);

		int sum = 0;
		for (int i = 0;i<=100; i +=3) {
		    sum += i; // sum += i�̶�� �ϸ� sum�� i�� ���ϰ� sum�� i�� ���� ���� �����Ѵ�.
		    // 0 +1 =1, 1 + 3 = 4
			
		}
		
		System.out.println( "1~100 ���� 3�� ����� �� = " + sum);
		
		
		odd = 0;
		int even = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0 )
				even += i;
			else
				odd += i;
			
		}
		System.out.println("1~100���� Ȧ���� �� = " + odd);
		System.out.println( "1~100 ���� 3�� ����� �� = " + sum);
		
		sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3 == 0)
				sum += i; // = >>>>> sum = sum + i
			
			System.out.println("1~100���� 3�� ����� �� = "+ sum);}
		
//	System.out.println("1~100���� 3�� ����� �� = "+ sum);
	}

}
