package stringBuffer;

public class Replace06 {

	public static void main(String[] args) {
		//! 
		StringBuffer sb = new StringBuffer("0123456789");
		//replace(시작 index, 끝 index, 대치할 문자)
	System.out.println(sb.replace(2, 3, "앙"));	// 뒤번호 포함 안하니까 2번의 항목만 앙으로 대치됨
	}

}
