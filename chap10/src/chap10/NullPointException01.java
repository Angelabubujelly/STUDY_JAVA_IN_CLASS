package chap10;

public class NullPointException01 {

	public static void main(String[] args) {
		//지역변수 String data는 반드시 초기화 해줘야 한다.
		
		String data = null;
		System.out.println(data.toString());

	}

}
