package stringBuffer;

public class SubString08 {

	public static void main(String[] args) {
		//! 
		StringBuffer sb = new StringBuffer("0123456789");
		//substring(시작 index) : 시작 index로부터 뒤 모두 반환
		//substring (시작 index, 끝 index) : 시작 index로 부터 끝 index 전 까지 반환
		System.out.println(sb.substring(7));
		System.out.println(sb.substring(2,8));
	}

}
