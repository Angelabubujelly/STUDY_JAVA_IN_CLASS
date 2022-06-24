package chap04_05;

public class Excercise03 {

	public static void main(String[] args) {
	//1~100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하ㅅㅔ여
		//3의 배수가 아닌 모든것을 빼면되는건디...
		
		int sum = 0;
		
		for (int i = 1; i<=100; i++) {
			if (i%3!=0)
				continue;
			sum+= i;
			
		}
		
		System.out.println("1~100까지의 3의 배수의 합 :" +sum);

	}



//더 간단한 건
//for(int i = 1; i<=100; i++) {
//	if (i%3==0)
//		sum+= i;
//}
//



}
