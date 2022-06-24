package singleton;

class Singleton {
	private static Singleton singleton = new Singleton(); //�� �ȿ��� �� ��ü�� ����. �ܺο��� ������
	private Singleton() /*�갡 ������ �ؿ����� ��ü���� ����*/ {
		
	}
	static Singleton getInstance(){ /*��ü ��ü�� ��ȯ�� �� �ִٴ� �ǹ���*/
		return singleton;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); <-���� �����̺� �̱��涧���� ��ü���� �Ұ�
		//new �� ���̸� �ּ� ����.
		Singleton s1 = Singleton.getInstance()	;
		Singleton s2 = Singleton.getInstance()	;
		if (s1 ==s2)/*�ּҰ� ���İ� ��*/ {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
		
	//����ڴ� �������� �������� �����ڴ� ������ �� �ְ� �� ��......,.,.,,.,.,.,.
		//new�� ��ü���� �� �� ���� �ڱ� ���ο����� �����ϰ�, ������ �� �ִ� method...
	}

}
