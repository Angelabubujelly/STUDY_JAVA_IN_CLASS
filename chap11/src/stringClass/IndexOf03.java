package stringClass;

public class IndexOf03 {

	public static void main(String[] args) {
		String str = "�ڹ� ���α׷�";
		//�ܾ �ִ°��� ������ index��ȣ ��ȯ
		int index = str.indexOf("�α�"); //index��ȣ�� ��ȯ�Ǳ� ������ ��ȯ���� int�Ӣ� indexOf �̰� �� �����ε� �Ǿ��ִ°ſ�!!!
		System.out.println(index); //��ĭ�� index ��ȣ 1���� �����ؿ� 
		
		if (str.indexOf("��ġ") != -1)
		System.out.println("��ġ å �Դϴ�.");
		else
			System.out.println("��ġ�� ���þ��� å�Դϴ�.");
		

	}

}
