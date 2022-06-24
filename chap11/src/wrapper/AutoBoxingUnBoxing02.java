package wrapper;

public class AutoBoxingUnBoxing02 {

	public static void main(String[] args) {
		int num = 100;
		Integer obj = num; //에러 안나유~ obj는 지금 객체얌
		
		int num2 = obj;
		int result = obj + 100;
		System.out.println(result);

	}

}
