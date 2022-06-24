package chap02_3;

public class OperationEx {

	public static void main(String[] args) {

		 byte b1 = 10;
		 byte b2 = 20;
//		 byte b3 = b1 +b2;  -->>>>>>>> byte + byte 는 int로 자동변환 됨.
		 int i1 = b1 + b2;
		 byte b3 = (byte)(b1 + b2);
		 
		 System.out.println(b3);
		 
		 
		 char ch1 = 'A';
		 char ch2 = 1; //unicode의 1은 null임 (?????)
		 //char ch3 = ch1 + ch2;  ------> ch + ch 도 int로 자동변환 됨.
		 int i2  = ch1 + ch2;
		 
		 System.out.println(i2); //A =65
		 
		 double dou1 = 7;
		 double dou2 = 3;
		 double dou3 = dou1 / dou2;
		 System.out.println(dou3);
		 
		 int i3 = 7;
		 int i4 = 3;
		 int i5 = i3 / i4; // 정수 / 정수 = 정수 (몫)
		 double dou4 = i3 / i4; // 정수 / 정수 = 정수가 나옴. But 실수형(소수점이 있는 데이터)이라 2.0이 됨. . . . . . . .
		 double dou5 =(double)i3 / i4; // or double dou5 = i3 / (double)i4; 두 수중에 한 수만 더블임 됨.
		 // 두수 중 하나가 실수형이라 실수형으로 자동 변환 됨.
		 
		 
		 System.out.println(i5); // int는 몫만 나오고 나머지 소수점 자리는 버 려 버 려 잍
		 System.out.println(dou4); // 요 자체, 인트에다 인트를 하니까 2.0 ??????????
		 System.out.println(dou5); //이러면 소수점 이하까지 나와용
		 
		 

	}

}
