package chap04_05;

public class Excercise03 {

	public static void main(String[] args) {
	//1~100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��Ϥ��Ŀ�
		//3�� ����� �ƴ� ������ ����Ǵ°ǵ�...
		
		int sum = 0;
		
		for (int i = 1; i<=100; i++) {
			if (i%3!=0)
				continue;
			sum+= i;
			
		}
		
		System.out.println("1~100������ 3�� ����� �� :" +sum);

	}



//�� ������ ��
//for(int i = 1; i<=100; i++) {
//	if (i%3==0)
//		sum+= i;
//}
//



}
