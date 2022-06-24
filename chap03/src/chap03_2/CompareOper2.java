package chap03_2;

public class CompareOper2 {

	public static void main(String[] args) {
		int num1 = 1;
		double dou1 = 1.0;
		System.out.println(num1 == dou1);
		
		float f1 = 0.1f; //f꼭 붙이삼
		double dou2 = 0.1;
		System.out.println(f1 == dou2);
		//double 8byte고 float 4byte임. 소수점 15번째 이하의 숫자가 달라져서 반올림 되고 하다보면 값이 변함. 
		//자료형이 다르면 false나옴.
		
		System.out.println(f1 == (float)dou2); //자료형이 같기 때문에 true
		System.out.println((double)f1 == dou2);
		
		
		//String과 같은 참조형은 주소가 들어있는 겨. 값하고 상관 없이 주소가 같은가 다른가를 판단함. ...?????????
		
	}

}
