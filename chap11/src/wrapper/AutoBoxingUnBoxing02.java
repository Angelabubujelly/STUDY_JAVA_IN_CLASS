package wrapper;

public class AutoBoxingUnBoxing02 {

	public static void main(String[] args) {
		int num = 100;
		Integer obj = num; //���� �ȳ���~ obj�� ���� ��ü��
		
		int num2 = obj;
		int result = obj + 100;
		System.out.println(result);

	}

}
