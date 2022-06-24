package chap04_05;

public class Cotinue02 {
//3의 배수를 제외한 합계를 구하시오.
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if(i%3==0)
				continue;
			sum += i;
		}
System.out.println("1~100까지 3의 배수를 제외한 합계 = " + sum);
		
// 1~10까지 홀수를 제외한 수들의 합을 구하시오

sum = 0; //초기화해주깅
for (int i = 1; i<=10; i++) {
	if(i%2 == 1)
		continue;
	sum += i;
}
System.out.println("1~10까지 짝수의 합 = "+ sum);
 	
	}

}
