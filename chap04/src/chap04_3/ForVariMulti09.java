package chap04_3;

public class ForVariMulti09 {

	public static void main(String[] args) {
	
	/*int i =1, j=2, z=3 ;
	 * 
	  ��
	  
	 * int i = 1;
	int j =2;
	int z = 3;
	�� ����.
	
	*int a, b, c; <- �ڷ����� ������ ���� ���� �� ������ �ʱ�ȭ??��ư  ������ �� �� �˴ϴ�~~~~
	
	
for (�ʱ�ȭ ,����, ����)
	*/
		int num1 =1, num2 =2, num3 =3;
		int a, b, c;
		for(int i =1, j=10; i<=10/*���ǽ��� ������ �ϳ��� �־�� ��. �������� ���Ѿ� ���� �ڸ� ���Ѿ� �� �� ��ǻ�ʹ� �����*/; i++, j--) {
			System.out.println(i + ", " + j);
			
		}
		System.out.println();
		
		for(int i=1,j=10,z=1; i<=10; i++,j--,z*=2/*2�� ������ ��Ű�ڴ� �̸�..?*/) {
			System.out.println(i + ", " + j + ", "+ z);
		}
		for (;;) {
			System.out.println(num1);
			//�ʱⰪ�� ����, ������ ���� �׳� ���Ѵ�� ���ุ �˴ϴ�.... �׾߸��� �� �� �� ��...
			num1++; //�̷��� if ������ �޾��ְ� break�� ������� for���� �������� �� �־��.
			if (num1 ==3)
				break;
		}
		

	}

}
