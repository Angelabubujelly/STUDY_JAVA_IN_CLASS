package chap04_3;

public class ForEx03 {

	public static void main(String[] args) {
		//1~100까지 홀수의 합 구하기
		
		int odd = 0;
		for(int i = 1; i<=100; i += 2) {
			odd += i;
		
			
			
		}
		
		System.out.println("1~100까지 홀수의 합 = " + odd);

		int sum = 0;
		for (int i = 0;i<=100; i +=3) {
		    sum += i; // sum += i이라고 하면 sum에 i를 더하고 sum에 i를 더한 값을 대입한다.
		    // 0 +1 =1, 1 + 3 = 4
			
		}
		
		System.out.println( "1~100 까지 3의 배수의 합 = " + sum);
		
		
		odd = 0;
		int even = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0 )
				even += i;
			else
				odd += i;
			
		}
		System.out.println("1~100까지 홀수의 합 = " + odd);
		System.out.println( "1~100 까지 3의 배수의 합 = " + sum);
		
		sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%3 == 0)
				sum += i; // = >>>>> sum = sum + i
			
			System.out.println("1~100까지 3의 배수의 합 = "+ sum);}
		
//	System.out.println("1~100까지 3의 배수의 합 = "+ sum);
	}

}
