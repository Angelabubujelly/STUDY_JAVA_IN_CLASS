package inheritanceFinal06;


//class앞에 final 붙으면 상속해줄 수 없다.
final class MemberImportant {
	
}


class Member{
	void method() {
		System.out.println("method() 호출");
	}
	final void method2() {
		System.out.println("final인 method2() 호출");
	}
}
class VeryImportantPerson extends Member{

	@Override
	void method() {
		System.out.println("자손의 메소드");
	}
	
//	void method2() {
//		System.out.println("자손의 final method2() 호출");} final 불으면 오버라이딩 할 수 없다...
	
	public class VeryPersonTest extends Member {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
