package stringBuffer;

public class StringBuilder09 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("java ");
		sb.append("Program Study");
		System.out.println(sb.toString()); //sb���� stringó�� overriding �� ��.. sb�� ��� �Ǵ°� sb(.toString()) �����Ȱž�
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
				System.out.println(sb);
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("�ѹ��ڼ�: " + length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
