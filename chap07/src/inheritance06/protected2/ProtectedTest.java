package inheritance06.protected2;

public class ProtectedTest {

	public static void main(String[] args) {
		C c = new C();
		c.methodC();
		//상속을 받았기 떄문에 객체는 생성가능...
		D d = new D();
		// protected가 붙어서 사용 불가
//		d.equals= "kkk";
//		d.methodA();
	}

}
