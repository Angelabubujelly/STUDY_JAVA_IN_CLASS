package chap04_3;

public class ForEx05 {

	public static void main(String[] args) {
		// 1~100���� 4�� ����� ��
		
		int sum = 0;
		int count = -1;
		for(int i=0; i<=100; i+=4) {
				sum += i;
				count++;
			
		}
		
		System.out.println("1~100���� 4�� ����� �� =" + sum);
		System.out.println("4�� ����� ���� = " + count);
		
		
		///���� ��츦 �� �� ���� �� �� �� .........
		
		
		sum = 0;
		count = 0;
		for (int i=1; i<=100; i++) {
			if(i%4 == 0) {
				
				sum += i;
				count++;
		}
		
		}
		System.out.println("1~100���� 4�� ����� �� = " + sum);
		System.out.println("4�� ����� ���� = " + count);

		sum = 0;
		int i;
		for ( i=1; i<=100; i++) {
			sum += i;
		
		}
		System.out.println("1~100������ �� = " + sum);
		System.out.println("���� = " + (i-1));
		
		//�ϴ� i������ַ��� for�� �ۿ��� �ϴ� int i;�� �����ؾ߸� ������.
		//i�� 101�� �Ǹ� ������ �Ǳ⶧���� �� �� for������ �������� 101�� ��Ÿ����. �޸� ������ ������ �ż� ������� �嵥..
		//��ȣ �Ȱ� �ۿ����� ����� õ�����̶�°͸� �ϴ� �˰� �������~~~ -1���ִ� �͵� ������ ���� �� ���� ���� ��ҽ�Ű�°Ŷ� -1���ִ°�
	}

}
