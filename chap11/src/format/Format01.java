package format;

import java.text.DecimalFormat;

public class Format01 {

	public static void main(String[] args) {
	double num = 123456.789;
	
	DecimalFormat df = new DecimalFormat("0000000000"); //�Ҽ��� ���Ϸδ� �ݿø� �� �߸��� ������ ������ 0�� ä������ �����°�
	System.out.println(df.format(num));
	df = new DecimalFormat("0.0");
	System.out.println(df.format(num));//�Ҽ��� ù�ڸ� ���Ϸδ� �ݿø� �� �߷���
	df = new DecimalFormat("0000000000.00000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("###########"); //�����ڸ���ŭ�� ���Ϳ�
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#,###.#"); 
	System.out.println(df.format(num));
	
	df = new DecimalFormat("\u20A9 #,###"); 
	System.out.println(df.format(num));
	System.out.println(String.format("%.1f", num));
	}

}
