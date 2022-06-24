package staticMethod;

public class StaticMethodTest {

	public static void main(String[] args) {
		
		int result = StaticMethod.add(7, 24);
		System.out.println(result);
		System.out.println(StaticMethod.multiply(4,5));
		
		//result = StaticMethod.addIns(6,8);
		StaticMethod sm1 = new StaticMethod(); 
		//인스턴스 메서드 사용하기 위해 객체 생성 = 호출됐다.
		result = sm1.addIns(5, 37);
		System.out.println(result);
//클래스.필드(속성,저장공간, 즉 static이 붙음),메서드
	}


}
