package operator;

public class Operator {
	/*연산자는 반드시 넣어야 함. ..??
	  
	 //라이브러리
	  * 1. 사칙연산
	 * 
	 * 먼저 지역번수 확인 하고, 객체 확인하고, 상수 구문??멀람;;;*/
	 String program;
	 char op;
	 int num1=1;
	 int num2=1;
	 String name;
	 int proYear;
	 
	 //누구의 프로그램인지...
	 //프로그램 한 지 몇년이 됐는지
	 Operator() {
		 this("이젠", 1);
	 }
	
	 
	 Operator(String name, int proYear){
		 this.name = name;
		 this.proYear = proYear;
	 }
	 
	 Operator(String program) {
		this.program =program;
		 if (program.equals("사칙")) //op == "사칙연산" <- 이렇게 하면 사칙연산의 주소가 들어가기때문에...
		System.out.println("♥사칙연산을 하는 프로그램♥");
		 
	  else 
		 System.out.println("♥면적을 구하는 프로그램♥");
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

