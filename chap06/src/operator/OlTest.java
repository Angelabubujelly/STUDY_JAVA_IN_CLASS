package operator;

import constructor.Api;
import method.Method03;

public class OlTest {

	public static void main(String[] args) {
		
		Ol a1 = new Ol();
		Ol a2 = new Ol("����");
		Ol a3 = new Ol("���",5);

		System.out.println("�̸�: " + a1.name + ", �ٴ� �Ⱓ : " +
		a1.month );
		System.out.println("�̸�: " + a2.name + ", �ٴ� �Ⱓ : " +
		a2.month );
		System.out.println("�̸�: " + a3.name + ", �ٴ� �Ⱓ : " +
				a3.month );
		
		Ol a5 = new Ol();

		
		System.out.println();
	
		
	}

}
;