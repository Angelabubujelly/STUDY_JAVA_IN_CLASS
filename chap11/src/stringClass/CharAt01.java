package stringClass;

public class CharAt01 {

	public static void main(String[] args) {
		String str = "[��������]�ڹ� ������ ���α׷���";
		
		char ch1 = str.charAt(7);
		System.out.println(ch1);
		
		String sn = "220508-4110000";
		char ch2 = 	sn.charAt(7);
		System.out.println(ch2);
		
		switch(ch2	) {
		case '1': case '3': //���� �ƴϰ� char�ϲ� �� �� �� ǥ �� �� �� ��
			System.out.println("�����Դϴ�.");
			break;
		case '2': case '4':
			System.out.println("�����Դϴ�.");
		}
	}

}
