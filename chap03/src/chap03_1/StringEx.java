package chap03_1;

public class StringEx {

	public static void main(String[] args) {
		
		String str = "java" + 8 + 9; //String ��ü�� ���ڿ��̿�. ���ڷ� �ν��ؼ� ���ڰ� �ٷ� ���ڷ� ��µ�
		System.out.println(str);

		str = "java" + ( 8 + 9); //���ڷ� ������ ���� �ڿ� ���� ���� ���ڷ� �ν�. ��ȣ�� �־��ָ� ���ڷ� �ν�.
		System.out.println(str);
		
		str = 3 + 3.0 + "java" + 9 + 5;
		System.out.println(str);
		
		
	}

}
