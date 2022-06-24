package chap04_3;

public class For02 {

	public static void main(String[] args) {

//		int sum;
//		sum = 1+2+3+4+5+6+7+8+9+10;
//		System.out.println("1~10까지의 합 = " + sum);
					
		int sum = 0;
		for(int num = 1; num<=10; num++) {
			sum = sum + num;
			
//			System.out.println(sum); <- 10번의 과정 모두 출력됨.
				
			
		}
		System.out.println("1~10까지의 합은 " + sum);
		
		//500~ 1000까지의 합계
		//sum 쓰려면 sum = 0; 초기화 해주세여...
		
		int rum = 0;
		for(int num = 500; num<=1000; num++) {
			rum = rum + num;
			
			System.out.println("500~1000까지의 합 : " + rum);
			
		}
	
	}

}
