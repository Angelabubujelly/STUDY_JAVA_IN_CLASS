package stringClass;

public class Trim08 {

	public static void main(String[] args) {
		String tel1 = "   032";
		String tel2 = "123     ";
		String tel3 = "   12   34    ";
		System.out.println(tel1);
		System.out.println(tel2 + ":");
		System.out.println(tel3+ ":");
		

		System.out.println(	tel1.trim());
		System.out.println(	tel2.trim() + ":");
		// trim()	�� �հ� �� ������ �����ְ�, ���� ������ ������ �״��.
		System.out.println(	tel3.trim() + ":");

	}

}
