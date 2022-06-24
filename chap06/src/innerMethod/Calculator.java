package innerMethod;

public class Calculator {
	//메소드
	int plus(int num1, int num2) {
		return num1+num2;	
	}
	
	double avg (int num1, int num2) {
		double sum =plus(num1,num2); //얘는 위의 plus 호출
		double avg = sum/2;
		return avg;
	}
	void execute() {
		double result = avg(7,10);
		println("실행결과 : "+ result);
	}
	void println(String message) {
		System.out.println(message);
	}
}
