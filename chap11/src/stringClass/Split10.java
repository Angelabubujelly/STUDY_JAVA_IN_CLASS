package stringClass;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Split10 {

	public static void main(String[] args) {
		//String Ŭ������ split()�޼ҵ� ���
		String str = "���׳�/�ܴ�/�̼���/������/����";
		String[]	 names = str.split("/");
		System.out.println(Arrays.toString(names)); //arrays.tostring ȣ�� �ϴ°� ���Ͱ� �� �������̵����� ���ִ°�

String str2 = "���׳�/�ܴ�,�̼���-������,����";
String[]	names2 = str2.split("/|,|-");
	System.out.println(Arrays.toString(names2));
	System.out.println(names2[3]);
	
	//StringTokenizerŬ������ object�� �ƴϰ� util�� �־ ��ü���� ����� ��.
	StringTokenizer st = new StringTokenizer(str2, "/|,|-");
	System.out.println("�����ִ� ��ū�� �� : " +st.countTokens());
	int length = st.countTokens();
	for (int i = 0; i<length; i++) {
//		System.out.print( st.nextToken() +", ");
	} System.out.println();
	while(st.hasMoreTokens()) { //�����ִ� ��ū �����°�~~~~ 
		System.out.print(st.nextToken() + ", ");
	}
	}

}
