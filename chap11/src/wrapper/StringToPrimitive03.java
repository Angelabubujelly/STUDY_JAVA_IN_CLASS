package wrapper;

public class StringToPrimitive03 {

	public static void main(String[] args) {
		String str = "100";
		int value1 = Integer.parseInt(str);
		double value2 = Double.parseDouble(str);
		String str2 ="true"; //boolean�Ҷ�� ���ڿ�����
		
		boolean bool = Boolean.parseBoolean(str2); //���ڿ��� ���� true false�� ��ȯ����� ��...
		
		if (bool) {
			
		}else {
			
		}
	}

}
