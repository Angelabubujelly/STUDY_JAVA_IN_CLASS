package chap04_05;

public class Cotinue02 {
//3�� ����� ������ �հ踦 ���Ͻÿ�.
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if(i%3==0)
				continue;
			sum += i;
		}
System.out.println("1~100���� 3�� ����� ������ �հ� = " + sum);
		
// 1~10���� Ȧ���� ������ ������ ���� ���Ͻÿ�

sum = 0; //�ʱ�ȭ���ֱ�
for (int i = 1; i<=10; i++) {
	if(i%2 == 1)
		continue;
	sum += i;
}
System.out.println("1~10���� ¦���� �� = "+ sum);
 	
	}

}
