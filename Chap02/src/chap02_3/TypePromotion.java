package chap02_3;

public class TypePromotion {

	public static void main(String[] args) {
		// 작은 크기를 큰 크기에 넣는 것은 자동 형 변환
		
		byte by1 = 13;				 //1byte
		short sh1 = by1;			 //2byte
		int i1 = sh1;				 //4byte
		long lo1 = i1; //자체가 int형이기 때문에, l 안붙여도 된다,,,구 하네여,,,			//8byte
		float fo1 = lo1; //자체가 long 형이기 때문에,, 에러가 안,,,난다구,,하네여,,,		//4byte
		double dou1 = fo1;														//8byte

		
		System.out.println(sh1);
		System.out.println(i1);
		System.out.println(lo1);
		System.out.println(fo1); //float 와 dou는 실수형이라 .0이 붙는다.
		System.out.println(dou1);
		System.out.println("---------ㅎㅎㅎㅎㅎ");
		
		char ch1 = '가';
		int i2 = ch1;
		
		System.out.println(i2); //unicode의 숫자로 나와용용
		System.out.println(ch1);
	}

}
