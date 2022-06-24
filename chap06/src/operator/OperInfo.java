package operator;

public class OperInfo {
//속성  : 변수를 지정하여 데이터 저장
	String name;
	int month;
	int num1;
	int num2;
	
//생성자 : new 키워드로 객채를 생성할 때 1번 호출
//		반환형이 없어서 오버로딩으로 여러개 만드는거야... 이름은 클래스 이름과 동일
	
	OperInfo(){
		this("김중경",1);
	}
	
	OperInfo (String name){
		this(name,2);
	}
	
	OperInfo(String name, int month)	{
		this.name = name;
		this.month = month;
	}
	
//메소드 : 기능 ㅡ> 프로그램을 실행하여 결과를 도출해 내는 것
//		반환형을 반드시 써줘야 함.정수형이면 int.. 없으면  void! 이름도 내맘대로 지어도 됨.
	void add() {
		num1 = 1;
		num2 = 1;
		System.out.println(num1+ "+"+ num2 + "=" + (num1+num2));
		
	}
	int add(int num1) {
		this.num1 = num1;
		num2 = 1; //정수값이 있으니까 num2임
		return this.num1+num2; 
	}
	void add(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(num1+ "+"+ num2 + "=" + (this.num1+this.num2));
	}
	
	void mul (int x, int y) {
		num1 = x;
		num2 = y;
		System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
	}
	void mul (int x) {
		num1 = x;
		num2 = 10;
		System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
	}
	void mul() {
		num1= 10;
		num2=10;
		System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
	}
}
