package stringClass;

public class Replace05 {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "dochi");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String newStr2 = oldStr.replaceFirst("�ڹ�", "java"); //ù �ܾ �ٲ���
		System.out.println(newStr2);

	}

}
