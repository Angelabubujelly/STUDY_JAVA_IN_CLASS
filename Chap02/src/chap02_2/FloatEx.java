package chap02_2;

public class FloatEx {

	public static void main(String[] args) {

			float flo1 = 0.123f;
			//float도 그냥 쓰면 double로 인식함. 8바이트를 4바이트로 넣을 수 없기에 에러나용
			//즉, 기본자료형인 double로 인식 -> Error
			// 둘의 차이는 소수점 몇번째 자리까지 인식하게 하느냐에 달려있다.
			//float는 6자리까지만 정확해서 double에 비해 불명확]
			//즉, 소수점 이하 6자리까지만 정확함 vs 소수점이하 float 그 이상 정확도를 요할 때 사용
			
			
			float flo2 = -3.14F;
			
			double dou1 = 3.4567;
			
			float flo3 = 0.1234567890123456f;
			double dou2 = 0.1234567890123456;
			System.out.println("float = " + flo3);
			System.out.println("double = " + dou2);

	}

}
