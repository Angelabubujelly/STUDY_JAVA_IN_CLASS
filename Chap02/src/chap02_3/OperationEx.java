package chap02_3;

public class OperationEx {

	public static void main(String[] args) {

		 byte b1 = 10;
		 byte b2 = 20;
//		 byte b3 = b1 +b2;  -->>>>>>>> byte + byte �� int�� �ڵ���ȯ ��.
		 int i1 = b1 + b2;
		 byte b3 = (byte)(b1 + b2);
		 
		 System.out.println(b3);
		 
		 
		 char ch1 = 'A';
		 char ch2 = 1; //unicode�� 1�� null�� (?????)
		 //char ch3 = ch1 + ch2;  ------> ch + ch �� int�� �ڵ���ȯ ��.
		 int i2  = ch1 + ch2;
		 
		 System.out.println(i2); //A =65
		 
		 double dou1 = 7;
		 double dou2 = 3;
		 double dou3 = dou1 / dou2;
		 System.out.println(dou3);
		 
		 int i3 = 7;
		 int i4 = 3;
		 int i5 = i3 / i4; // ���� / ���� = ���� (��)
		 double dou4 = i3 / i4; // ���� / ���� = ������ ����. But �Ǽ���(�Ҽ����� �ִ� ������)�̶� 2.0�� ��. . . . . . . .
		 double dou5 =(double)i3 / i4; // or double dou5 = i3 / (double)i4; �� ���߿� �� ���� ������ ��.
		 // �μ� �� �ϳ��� �Ǽ����̶� �Ǽ������� �ڵ� ��ȯ ��.
		 
		 
		 System.out.println(i5); // int�� �� ������ ������ �Ҽ��� �ڸ��� �� �� �� �� ��
		 System.out.println(dou4); // �� ��ü, ��Ʈ���� ��Ʈ�� �ϴϱ� 2.0 ??????????
		 System.out.println(dou5); //�̷��� �Ҽ��� ���ϱ��� ���Ϳ�
		 
		 

	}

}
