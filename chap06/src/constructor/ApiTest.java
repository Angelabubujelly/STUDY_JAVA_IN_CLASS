package constructor;

public class ApiTest {

	public static void main(String[] args) {
		//������ ���� ���� �� ���ѵ� �ſ�~~~! ��
		
		Api a1 = new Api();
		Api a2 = new Api(29);
		Api a3 = new Api("���߰�",28);
		Api a4 = new Api("����","010-8888-8888",2);
		
		System.out.println("�̸�: " + a1.name + ", ��ȭ��ȣ : " +
		a1.num + ", ���� : " + a1.age);
		System.out.println("�̸�: " + a2.name + ", ��ȭ��ȣ : " +
		a2.num + ", ���� : " + a2.age);
		System.out.println("�̸�: " + a3.name + ", ��ȭ��ȣ : " +
				a3.num + ", ���� : " + a3.age);
		System.out.println("�̸�: " + a4.name + ", ��ȭ��ȣ : " +
				a4.num + ", ���� : " + a4.age);

	}

}
