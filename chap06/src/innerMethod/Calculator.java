package innerMethod;

public class Calculator {
	//�޼ҵ�
	int plus(int num1, int num2) {
		return num1+num2;	
	}
	
	double avg (int num1, int num2) {
		double sum =plus(num1,num2); //��� ���� plus ȣ��
		double avg = sum/2;
		return avg;
	}
	void execute() {
		double result = avg(7,10);
		println("������ : "+ result);
	}
	void println(String message) {
		System.out.println(message);
	}
}
