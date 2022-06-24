package wrapper;

public class StringToPrimitive03 {

	public static void main(String[] args) {
		String str = "100";
		int value1 = Integer.parseInt(str);
		double value2 = Double.parseDouble(str);
		String str2 ="true"; //boolean할라믄 문자열ㄴㄴ
		
		boolean bool = Boolean.parseBoolean(str2); //문자열을 논리인 true false로 변환해줘야 함...
		
		if (bool) {
			
		}else {
			
		}
	}

}
