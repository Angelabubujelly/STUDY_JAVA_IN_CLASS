package format;

import java.text.DecimalFormat;

public class Format01 {

	public static void main(String[] args) {
	double num = 123456.789;
	
	DecimalFormat df = new DecimalFormat("0000000000"); //소수점 이하로는 반올림 뒤 잘리고 정수만 나오고 0이 채워져서 나오는겨
	System.out.println(df.format(num));
	df = new DecimalFormat("0.0");
	System.out.println(df.format(num));//소수점 첫자리 이하로는 반올림 뒤 잘려융
	df = new DecimalFormat("0000000000.00000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("###########"); //정수자리만큼만 나와용
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#,###.#"); 
	System.out.println(df.format(num));
	
	df = new DecimalFormat("\u20A9 #,###"); 
	System.out.println(df.format(num));
	System.out.println(String.format("%.1f", num));
	}

}
