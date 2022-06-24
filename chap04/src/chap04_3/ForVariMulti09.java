package chap04_3;

public class ForVariMulti09 {

	public static void main(String[] args) {
	
	/*int i =1, j=2, z=3 ;
	 * 
	  와
	  
	 * int i = 1;
	int j =2;
	int z = 3;
	는 같다.
	
	*int a, b, c; <- 자료형이 같으면 변수 값만 안 줬지만 초기화??암튼  선언은 한 게 됩니당~~~~
	
	
for (초기화 ,조건, 증감)
	*/
		int num1 =1, num2 =2, num3 =3;
		int a, b, c;
		for(int i =1, j=10; i<=10/*조건식은 무조건 하나만 넣어야 함. 선조건을 지켜야 할지 뒤를 지켜야 할 지 컴퓨터는 몰라용*/; i++, j--) {
			System.out.println(i + ", " + j);
			
		}
		System.out.println();
		
		for(int i=1,j=10,z=1; i<=10; i++,j--,z*=2/*2의 제곱을 시키겠다 이말..?*/) {
			System.out.println(i + ", " + j + ", "+ z);
		}
		for (;;) {
			System.out.println(num1);
			//초기값도 없고, 증감도 없이 그냥 무한대로 실행만 됩니당.... 그야말로 무 한 반 복...
			num1++; //이렇게 if 조건을 달아주고 break를 적어줘야 for문을 빠져나올 수 있어용.
			if (num1 ==3)
				break;
		}
		

	}

}
