package chap11;

import java.util.Date;

public class ToStringEx05 {

	public static void main(String[] args) {
		Object obj = new Object();
		
		// .toString()	 �� ȣ���ϸ� Ŭ�����̸�@�ؽ��ڵ� ��������.
		System.out.println(obj.toString());
		//��ü������ ȣ���ϸ� .toStirng()�� �����Ȱ��̴�.
		
		//��ü ������ ȣ���ϸ� . toString()�� ������ ���̴�.
		System.out.println(obj);//.toString �� �ٿ��� �ڵ����� �پ� ��µ�.
		
		String str = new String("ȫ�浿"); 
		// .toString()�� �������̵� �ؼ� ȫ�浿�� ����!
		System.out.println(str.toString());
		System.out.println(str);
 
Date date = new Date();
System.out.println(date); //�굵 .toString�������̵� �ǰ� ���� �Ȱ���.
	}

}
