package operator;

public class OperInfoTest {

	public static void main(String[] args) {
		OperInfo oi1 = new OperInfo(); //�Ű������� ���� ���� ������... �׸��� ���°��� ȣ���.. �׷����� 2��¥���� ȣ���...
		System.out.println(oi1.name);
		System.out.println(oi1.month);
		System.out.println(oi1.num1);
		System.out.println(oi1.num2);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		
		OperInfo oi2 = new OperInfo("����");
		System.out.println(oi2.name);
		System.out.println(oi2.month);
		System.out.println(oi2.num1);
		System.out.println(oi2.num2);
		

		System.out.println(oi1.add(35));
		
			oi2.add(6,8); //ȣ�⸸ ����,,,?
			
	}

}
