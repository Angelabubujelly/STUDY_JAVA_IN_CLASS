package total;

public class TotalEx {

	public static void main(String[] args) {

		//변수 : 저장공간을 마련함
		//리터럴 : 변수를 선언하면서 바로 값을 넣는 것
		// 문자 1개
		
		char char1 = '&'; 
		char char2 =  'a' + 2; 
		System.out.println(char2);

		// char char3 = char1 + 5;   --->강제 형변환 돼서 int형이 돼 에러남. "연산시 무조건 int형으로 형변환이 됨"
		
		//정수형
		int num1 = 89;
		int num2 = 5;
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
		result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result + " : 몫만 나옴"); //소수점 말구 몫만 나옴
		
		double result2 = (double)num1 / num2; //몫 + .0 나오기에 둘 중 하나에 더블을 붙여줌
		System.out.println(num1 + " / " + num2 + " = " + result2);
		
		
		// 정수형의 Long형은 반드시 뒤에 L을 붙여야 한다.
		long long1 = 1234567890230492304L;
		
		
		//실수형
		//float은 반드시 뒤에 f를 붙인다. 소수점 이하 6자리까지 정확함
		float float1 = 12.3456F;
		
		//double형
		//double형은 소수점 이하 15자리까지 정 확 함
		double double1 = 12.34567893522141242412412421434634634634346;
		
		
		//형변환
		//자동형변환 : 작은 자료형을 큰 자료형에 넣을 때 
		byte byte1 = 17;
		int i1 = byte1;
		char ch1 = 'a'; //a = 97
		int i2 = ch1;
		double dou1 = i2;
		
		System.out.println(dou1);
		
		
		// 문제는. 강 제 형 변 환  : 큰 자료형을 작은 자료형에 넣을 때
		long lo1 = 198L;
		int i3 = (int)lo1;
		double dou2 = 9.3848;
		float fl1 = (float)dou2;
		
		System.out.println(i3);
		System.out.println(fl1);
		
		//연산시 형변환 <------------- 요기부터 머리 폭발해서 이해 불가 ㅋㅋㅋㅋㅋㅋ
		// int형보다 작은 형(byte, short, char, int)들을 연산할 때 무조건 int형으로 변환 됨.
		byte b1 = 13;
		byte b2 = 5;
		//byte b3 = b1 * b2;
		int re = b1 * b2; 
		
		// 큰 자료형과 작은 자료형을 연산할 때는 무조건 큰 자료형으로 자동형변환
			int n1  = 36;
			long lon1 = 38L; //L안 붙이면 int 형이어라
			//int re2 = n1 + (int)lon1; long형으로 자동형변환
			int re2 = n1 + (int)lon1; //long형을 강제로 int형으로 변환하여 int+int=int 형으로 ...
			long re3 = n1 + lon1; // int + long = long ---->그야말로 자동형변환
			
			byte bv = 10;
			float fv = 2.5F;
			double dv = 2.5;
			char cv = 'a';
			
		  
		
		
		
		
	
	}

}
