package chap04_04;

public class Whil01 {

	public static void main(String[] args) {
		for(int i=1; i<=1; i++)	{
			System.out.println(i);
		}
		System.out.println();
		
		int j = 1;
		while( j <=10) {
			System.out.println(j);
			j++;
			
		}
		
		//1~100까지의 합계 구하기...
		int sum = 0;
		for (int z = 1; z<=100; z++) {
			sum += z;
		}
			
			System.out.println(sum);
			
			sum= 0;
			int z= 1;
			while (z <= 100 ) {
				sum+=z;
				z++;
			}
			System.out.println(sum);
					
	}

}
