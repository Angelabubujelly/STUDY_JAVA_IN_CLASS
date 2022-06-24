package method;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method01 me01 = new Method01();

		
		int sum = me01.add(); // int sum 에다가 저 매소드를 넣으라는겨...
		 System.out.println("두 수의 합 : " + sum);
	
		 double divide = me01.divide();
		 System.out.println("나눗셈 결과 : " + divide);

		 
		 System.out.println("num1의 값이 더 큰가?" + me01.com());
	System.out.println("맨 마지막 이름은 : "+ me01.methodStr());
	System.out.println("1~100까지 짝수의 합 : " +me01.sum1());
	
	
	me01.void1();
	
	}
	
	// num2 / num1 

}
