package chap03_3;

public class AssignmoentOp {

	public static void main(String[] args) {
		int num1 = 10;
//		num1 = num1 + 1; //����?
		num1 += 1; //������ num1���� 1�� ���� num1���� ������� ���� ��
		System.out.println(num1);
		
		//to be ^^
		//1. ������, ����� �� �̸��� ���� �� �̸��� ���� ������ �ϴ��� �� �� ���� ������ �̸��� �� ���̴� ���.
		//ex) age, name ��� �� �̰� ���̾��, �� �̰� �̸����..��
		//2. �ּ� �� �ٴ� ���... ������Ʈ ���� �� �� 
		//ex)������ �����ִ� �κ�, �н����� �߸����� �� �����ִ� ������ �� �����ִ�... ���α׷� ��� �� ������ ����
		//    ������Ʈ �� �� ������ �� �κ��� ������ �ּ��� ���� �ٷ� ã�� �� �ִ�.
		//3. �Ȱ��� ����� �� �� ���� ª�� ���... �� �� ��
		
		num1 -= 5;
		System.out.println(num1);
		
		num1 *= 4;
		System.out.println(num1);
		
		num1 /= 5;
		System.out.println(num1);
		
		num1 %= 3;
		System.out.println(num1); //�� �ټ����� ���� ��
		

		
	}

}
