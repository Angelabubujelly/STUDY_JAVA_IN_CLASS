package accessModifier;

public class BFieldMethod {
	public BFieldMethod() {
		AFieldMethod a = new AFieldMethod();
		a.value1 = 10;
		a.value2 = 10; //default라 value2도 사용 가능
//		a.value3 = 20; -> privateㅇㅣ라 접근 불가능
		
		a.method1();
		a.method2();
//		a.method3();  -> privateㅇㅣ라 접근 불가능
	}
}
