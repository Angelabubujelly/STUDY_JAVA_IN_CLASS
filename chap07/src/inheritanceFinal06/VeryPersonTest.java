package inheritanceFinal06;


//class�տ� final ������ ������� �� ����.
final class MemberImportant {
	
}


class Member{
	void method() {
		System.out.println("method() ȣ��");
	}
	final void method2() {
		System.out.println("final�� method2() ȣ��");
	}
}
class VeryImportantPerson extends Member{

	@Override
	void method() {
		System.out.println("�ڼ��� �޼ҵ�");
	}
	
//	void method2() {
//		System.out.println("�ڼ��� final method2() ȣ��");} final ������ �������̵� �� �� ����...
	
	public class VeryPersonTest extends Member {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
