package stringBuffer;

public class StringBufferClass01 {

	public static void main(String[] args) {
		//equals overrinding ���� �� �� ��.
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb == sb2);
		 
		//object class�� equals() �޼ҵ带 ȣ��, �ּҸ� ����. �������̵� ����
		System.out.println(sb.equals(sb2));

	}

}
