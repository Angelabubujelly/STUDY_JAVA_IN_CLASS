package accessModifier;

public class AFieldMethod {
	public 	int value1; //어디에서든 접근 가능
	int value2; //같은 패키지 안에서만 사용 가능
	private int	value3; //현재 클래스 안에서만 사용 가능

	public AFieldMethod() {
		value1 = 1;
		value2 = 1;
		value3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
}
