package stringBuffer;

public class SubString08 {

	public static void main(String[] args) {
		//! 
		StringBuffer sb = new StringBuffer("0123456789");
		//substring(���� index) : ���� index�κ��� �� ��� ��ȯ
		//substring (���� index, �� index) : ���� index�� ���� �� index �� ���� ��ȯ
		System.out.println(sb.substring(7));
		System.out.println(sb.substring(2,8));
	}

}
