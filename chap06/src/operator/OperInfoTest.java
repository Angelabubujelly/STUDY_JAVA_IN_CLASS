package operator;

public class OperInfoTest {

	public static void main(String[] args) {
		OperInfo oi1 = new OperInfo(); //매개변수가 없는 것이 생성됨... 그리고 없는것이 호출됨.. 그러고보니 2개짜리가 호출됨...
		System.out.println(oi1.name);
		System.out.println(oi1.month);
		System.out.println(oi1.num1);
		System.out.println(oi1.num2);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		
		OperInfo oi2 = new OperInfo("이젠");
		System.out.println(oi2.name);
		System.out.println(oi2.month);
		System.out.println(oi2.num1);
		System.out.println(oi2.num2);
		

		System.out.println(oi1.add(35));
		
			oi2.add(6,8); //호출만 해줌,,,?
			
	}

}
