package method;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method01 me01 = new Method01();

		
		int sum = me01.add(); // int sum ���ٰ� �� �żҵ带 ������°�...
		 System.out.println("�� ���� �� : " + sum);
	
		 double divide = me01.divide();
		 System.out.println("������ ��� : " + divide);

		 
		 System.out.println("num1�� ���� �� ū��?" + me01.com());
	System.out.println("�� ������ �̸��� : "+ me01.methodStr());
	System.out.println("1~100���� ¦���� �� : " +me01.sum1());
	
	
	me01.void1();
	
	}
	
	// num2 / num1 

}
