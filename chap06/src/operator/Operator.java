package operator;

public class Operator {
	/*�����ڴ� �ݵ�� �־�� ��. ..??
	  
	 //���̺귯��
	  * 1. ��Ģ����
	 * 
	 * ���� �������� Ȯ�� �ϰ�, ��ü Ȯ���ϰ�, ��� ����??�ֶ�;;;*/
	 String program;
	 char op;
	 int num1=1;
	 int num2=1;
	 String name;
	 int proYear;
	 
	 //������ ���α׷�����...
	 //���α׷� �� �� ����� �ƴ���
	 Operator() {
		 this("����", 1);
	 }
	
	 
	 Operator(String name, int proYear){
		 this.name = name;
		 this.proYear = proYear;
	 }
	 
	 Operator(String program) {
		this.program =program;
		 if (program.equals("��Ģ")) //op == "��Ģ����" <- �̷��� �ϸ� ��Ģ������ �ּҰ� ���⶧����...
		System.out.println("����Ģ������ �ϴ� ���α׷���");
		 
	  else 
		 System.out.println("�������� ���ϴ� ���α׷���");
}
	 
	 void OperatorTest (char op) {
		 switch(op)/*if(op=="*")*/ {
			case '+' :
			System.out.println(num1+ "+"+ num2 + "=" + (num1+num2));
			break;
			
			case '-' :
				System.out.println(num1+ "-"+ num2 + "=" + (num1-num2));
			break;
			case '*' :
				System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
			break;
			case '%' :
				System.out.println(num1+ "%"+ num2 + "=" + (num1%num2));
			break;
		 
	 }
	 }
	 
	 void oper (char op, int num1) {
		 switch(op)/*if(op=="*")*/ {
			case '+' :
			System.out.println(num1+ "+"+ num2 + "=" + (num1+num2));
			break;
			
			case '-' :
				System.out.println(num1+ "-"+ num2 + "=" + (num1-num2));
			break;
			case '*' :
				System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
			break;
			case '%' :
				System.out.println(num1+ "%"+ num2 + "=" + (num1%num2));
			break;
	 }
		 
	 }
	 
	 void oper (char op, int num1, int num2) {
	  
	 switch(op)/*if(op=="*")*/ {
		case '+' :
		System.out.println(num1+ "+"+ num2 + "=" + (num1+num2));
		break;
		
		case '-' :
			System.out.println(num1+ "-"+ num2 + "=" + (num1-num2));
		break;
		case '*' :
			System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
		break;
		case '%' :
			System.out.println(num1+ "%"+ num2 + "=" + (num1%num2));
		break;
	}
		 
	 }
}

