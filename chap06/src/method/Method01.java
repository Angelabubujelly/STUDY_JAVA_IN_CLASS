package method;

import java.util.Scanner;

public class Method01 {

	int num1 =31;
	int num2 = 20;
	String name;
	boolean bool;
	double numDou;
	double result;
	
	// ���� �޼ҵ� ��ȯ���� ������ ���� �����ϰھ��..
	
	 int add() { //������ �ڷ����� ���ƾ� ��... int int ���ƿ뤷��
		 int sum =num1 + num2;
		 return  sum;
	 }
		 
		 double divide() {
			numDou = (double)num2 / num1;
		 return numDou;
		 }
	 
		 boolean com() {
			 if(num1>num2)
				 bool = true;
			 else
				 bool =false;
			 return bool;
		 }
		 
		 String methodStr() {
			 for(int i = 1; i<=10; i++) {
				 name = "����" + i;
				 System.out.println(name);
			 }
		 
			 return name;
		 }
		 
		 int sum1() {
			 int sum1 = 0;
			 for(int i =1; i<=100; i++) {
				 if(i%2 ==0)
					 sum1 += i; 
			 }
			 return sum1;
		 }
		 
		 void  void1() {
			 Scanner scan = new Scanner(System.in);
			 System.out.println("������ �Է� :" );
			 String op = scan.next();
			 
			
			 switch (op) {
			 case "+" :
				System.out.println("�հ� = " + num1 + num2);
				break;
			 case "-" :
				 System.out.println("���� ��� = " + (num1 - num2));
				 break;
			 case "*" :
				 System.out.println("���� ��� = " + (num1 * num2));
				 break;
			 case "%" :
				 System.out.println("������ = "+ num1 %num2);
			 break;
			 case "/":
			 System.out.println("�� = "+ num1 / num2);
			 }
		 }
			 
			 
			 String  void2() {
				 Scanner scan = new Scanner(System.in);
				 System.out.println("������ �Է� :" );
				 String op2 = scan.next();
				 
				
				 switch (op2) {
				 case "+" :
					System.out.println("�հ� = " + num1 + num2);
					break;
				 case "-" :
					 System.out.println("���� ��� = " + (num1 - num2));
					 break;
				 case "*" :
					 System.out.println("���� ��� = " + (num1 * num2));
					 break;
				 case "%" :
					 System.out.println("������ = "+ num1 %num2);
				 break;
				 case "/":
				 System.out.println("�� = "+ num1 / num2);
				 }
				 return"���α׷� ��";
				 //���� �� ������ �� void �ϼ�
		 }
}
