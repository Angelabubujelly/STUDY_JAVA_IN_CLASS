package staticMethod;

public class StaticMethod {
	//�ν��Ͻ� ����-> Ŭ���� �޼ҵ忡���� ��� �Ұ���
	int x = 10;
	int y = 20;
	
	//Ŭ���� �޼��忡���� Ŭ���������� ����� �� ����.
	//Ŭ���� ������ Ŭ����,�ν��Ͻ� �޼��� ��� ��� ����
	static int i= 10;
	static int j= 20;
	
	//Ŭ���� �޼��� -> ��ü�� �������� �ʰ� ��� ����. ����ƽ�� �� ������ �ݵ�� ��ü�� �����ؾ߸� ����� �� ����,

	static int add(int x, int y) {
		return i+j;
	}
	static int subtract(int x, int y) {
		return x-y;
	}
	static int multiply(int x, int y) {
		return x*y;
	}
	//�ν��Ͻ� �޼��� -> �ݵ�� ��ü�� �����ؾ߸� ��밡��
	int addIns(int x1, int y1) {
		int result = i+j; //��ü���� �ϵ� �� �ϵ� ��� ����!!
		//Ŭ�����̸�.i�̵�..
		return x + y; //�ν��Ͻ� �������� x�� y��...
	}
	int subtractIns(int x, int y) {
		return x-y;
	}
	int multiplyIns(int x, int y) {
		return x*y;
	}
}

//��·�� �� �� �� �� ���ÿ� �ö��..��...��...