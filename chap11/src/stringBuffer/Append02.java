package stringBuffer;

public class Append02 {

	public static void main(String[] args) {
		//append() : �ڿ� �ٸ� ���ڿ� �߰����ִ� �޼ҵ�~!
		StringBuffer sb = new StringBuffer("abc");
//		StringBuffer sb2 = sb.append("def");
		System.out.println(sb.append("def"));
		System.out.println(sb); //append ���༭ def�߰��� ä�� ���ڿ��� ���
		System.out.println(sb.append(false));
		System.out.println(sb);
		System.out.println(sb.length());
		

	}

}
