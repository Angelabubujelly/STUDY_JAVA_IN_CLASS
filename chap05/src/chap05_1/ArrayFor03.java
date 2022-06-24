package chap05_1;

public class ArrayFor03 {

	public static void main(String[] args) {
		int num[]	= {	4,7,2,9,6};

		for (int i = 0; i<=4; i++) {
			System.out.print(num[i] + " ");
		}
		 System.out.println("\n");
		for(int i =0; i<=4; i++) {
		System.out.println(num[i]);
		}
		// 짝수 넣기
		 System.out.println("\n");
		 
		 for(int i=0; i<=4; i++) {
			 num [i] = i*2 ;
			 
		 }		 for(int i=0; i<=4; i++) {
			 System.out.print(num[i] + " ");
			 
		 }
		 //  배열의 합계 구하기
		 int num2[] = {4,7,2,9,6};
		 int sum = 0;
		 
		 for(int i = 0; i<=4; i++) {
			 sum += num2[i]; //sum = sum + num[i];
	
		 }
		 System.out.println("배열의 합은 = " + sum);
	
		int n1 = 4;
		int n2 = 7;
		int a2 = 2;
		int b8 = 9;
		int i3 = 6;
		
		int hap = n1 + n2 + a2 + b8 + i3; //for문을 돌 릴 수 가 없 어 요 변 수 명 이 다 다 르 니 까 .. ..

	}

}
