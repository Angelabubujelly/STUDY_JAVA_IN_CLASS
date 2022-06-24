package chap02_3;

public class TypeCasting {

	public static void main(String[] args) {
		// 강제 형변환 : 큰 크기의 자료형을 작은 크기의 자료형에 넣을 때 
		
		int i1 = 44032;
		//char ch1 = i1; //int는 4byte인데 char, 2byte에 넣으려니 에러가나지영
			char ch1 = (char)i1;
			
			System.out.println(ch1);
			System.out.println(i1);
			
			long lo1 = 450;
			//int i2 = lo1;   ---> long 형을 int에 넣으려니 에러가나지영
			int i2 = (int)lo1;
			
			System.out.println(i2);
			
			double dou1 = 34.5678;
//			int i3 = dou1; 8byte를 4byte에 넣으려니 에러가
			
			int i3 = (int)dou1;
			System.out.println(i3); //실수를 정수로 바꿀때는 소수점 자리는 무조건 버려용.
		
			
			
	}

}
