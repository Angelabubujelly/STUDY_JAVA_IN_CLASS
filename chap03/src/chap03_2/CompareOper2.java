package chap03_2;

public class CompareOper2 {

	public static void main(String[] args) {
		int num1 = 1;
		double dou1 = 1.0;
		System.out.println(num1 == dou1);
		
		float f1 = 0.1f; //f�� ���̻�
		double dou2 = 0.1;
		System.out.println(f1 == dou2);
		//double 8byte�� float 4byte��. �Ҽ��� 15��° ������ ���ڰ� �޶����� �ݿø� �ǰ� �ϴٺ��� ���� ����. 
		//�ڷ����� �ٸ��� false����.
		
		System.out.println(f1 == (float)dou2); //�ڷ����� ���� ������ true
		System.out.println((double)f1 == dou2);
		
		
		//String�� ���� �������� �ּҰ� ����ִ� ��. ���ϰ� ��� ���� �ּҰ� ������ �ٸ����� �Ǵ���. ...?????????
		
	}

}
