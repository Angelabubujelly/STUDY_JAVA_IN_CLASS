package chap02_2;

public class CharEx {

	public static void main(String[] args) {
		int var1 = 10;
		System.out.println(var1);
//		8����

		int var2 = 010;
		System.out.println(var2);
//		16����
		
		int var3 = 0x100;
		System.out.println(var3 + '\n'); //'\n'�� ���;�
		
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '\u0041';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println("--------------------------------"); //���м�
		
		char ch4 = '��';
		char ch5 = 44032;
		char ch6 = '\uac00';
		
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		int unicode = ch1;
		System.out.println(unicode);
		System.out.println("----");
		
		char ch7 = 'a' + 1; //���ͷ� ��? a�� �����ڵ�� �Ϲ� 97�ε� +1 �ϴϱ� 98 = b, ����غ���
		System.out.println(ch7);
		
//		char ch8 = ch1 + 1; 
		//������ ����ִ� A�� +1�� �ϸ� ������ ��. ������ ����ȯ�� �� int�� �����Ǵ°Ŷ� 4����Ʈ�� 2����Ʈ�� �� �� ���� ������.
		
		int i1 = ch7; //98
		int i2 = ch7 + 1; //99
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("-----");
		
		int i3 = 'A' + 'B'; // ����ȯ int������ ��ȯ�� �ż� 65+ 66 . . . �� ���������� ���� �� ���ϴµ� 
		System.out.println(i3);
		
	}

}
