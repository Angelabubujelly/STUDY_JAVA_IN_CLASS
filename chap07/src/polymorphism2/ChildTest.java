package polymorphism2;

public class ChildTest {

	public static void main(String[] args) {
		Child child = new Child(); //�޼ҵ�2�� �������̵��ؼ� ��װ͸� ���տ�
		 child.method1();
		 child.method2();
		 child.method3();
		 
// �θ�Ÿ������ ��ȯ�߱� ������ �θ��� �޼ҵ常 ����� �� ����,
// ��, �������̵� �� ���� �ڽİ��� ȣ���.
//�� �ڽ��� ��ü ���� �� �θ�Ÿ������ ����ȯ. �θ�͸� ��� ����. 
//������ override�� ���� �ڽ��� ���� ���
		 Parent parent = new Child(); 
		 parent.method1();
		 parent.method2();
//parent.metho3();�� �� �ߴ� ����
//����ȯ�� �θ�Ÿ������ �ؼ� �ڽĿ� �ִ°Ŷ�....

	}

}
