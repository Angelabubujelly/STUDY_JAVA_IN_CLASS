package method;

public class Method02 {
	int add(int num1, int num2) { //인트형으로 저장공간을 만들고 변수 2개를 저장공간에 저장
		int sum = num1 + num2;
		return sum;
		
	}
	
	int subtract (int num1, int num2) {//나를 호출 할 땐 숫자 2개 넣어라잉ㅋ
		int sum = num1-num2;
	return sum;
	}
	int multifly (int num1, int num2) {
		int mul = num1*num2;
		return mul;
	}
	
	double divide (int num1, double num2) { //여기 안은 내가 받고싶은 자료형으로 
		double divi = num1/num2;
		return divi;
	}
}
