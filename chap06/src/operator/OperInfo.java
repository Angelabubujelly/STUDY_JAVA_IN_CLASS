package operator;

public class OperInfo {
//�Ӽ�  : ������ �����Ͽ� ������ ����
	String name;
	int month;
	int num1;
	int num2;
	
//������ : new Ű����� ��ä�� ������ �� 1�� ȣ��
//		��ȯ���� ��� �����ε����� ������ ����°ž�... �̸��� Ŭ���� �̸��� ����
	
	OperInfo(){
		this("���߰�",1);
	}
	
	OperInfo (String name){
		this(name,2);
	}
	
	OperInfo(String name, int month)	{
		this.name = name;
		this.month = month;
	}
	
//�޼ҵ� : ��� ��> ���α׷��� �����Ͽ� ����� ������ ���� ��
//		��ȯ���� �ݵ�� ����� ��.�������̸� int.. ������  void! �̸��� ������� ��� ��.
	void add() {
		num1 = 1;
		num2 = 1;
		System.out.println(num1+ "+"+ num2 + "=" + (num1+num2));
		
	}
	int add(int num1) {
		this.num1 = num1;
		num2 = 1; //�������� �����ϱ� num2��
		return this.num1+num2; 
	}
	void add(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(num1+ "+"+ num2 + "=" + (this.num1+this.num2));
	}
	
	void mul (int x, int y) {
		num1 = x;
		num2 = y;
		System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
	}
	void mul (int x) {
		num1 = x;
		num2 = 10;
		System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
	}
	void mul() {
		num1= 10;
		num2=10;
		System.out.println(num1+ "*"+ num2 + "=" + (num1*num2));
	}
}
