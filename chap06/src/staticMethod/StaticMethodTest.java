package staticMethod;

public class StaticMethodTest {

	public static void main(String[] args) {
		
		int result = StaticMethod.add(7, 24);
		System.out.println(result);
		System.out.println(StaticMethod.multiply(4,5));
		
		//result = StaticMethod.addIns(6,8);
		StaticMethod sm1 = new StaticMethod(); 
		//�ν��Ͻ� �޼��� ����ϱ� ���� ��ü ���� = ȣ��ƴ�.
		result = sm1.addIns(5, 37);
		System.out.println(result);
//Ŭ����.�ʵ�(�Ӽ�,�������, �� static�� ����),�޼���
	}


}
