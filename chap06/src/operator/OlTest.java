package operator;

import constructor.Api;
import method.Method03;

public class OlTest {

	public static void main(String[] args) {
		
		Ol a1 = new Ol();
		Ol a2 = new Ol("밤블비");
		Ol a3 = new Ol("경몽",5);

		System.out.println("이름: " + a1.name + ", 다닌 기간 : " +
		a1.month );
		System.out.println("이름: " + a2.name + ", 다닌 기간 : " +
		a2.month );
		System.out.println("이름: " + a3.name + ", 다닌 기간 : " +
				a3.month );
		
		Ol a5 = new Ol();

		
		System.out.println();
	
		
	}

}
;