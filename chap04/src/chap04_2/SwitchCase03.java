package chap04_2;

public class SwitchCase03 {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 5;
		String op = "-";
		
		switch(op) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
		break;
		case "%":
			System.out.println(num1 % num2);
			break;
		}

	}

}
