package abstract01;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("홍길동");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		
//		Phone p = new Phone("아무개");
// ※abstract이 붙어있는 Phone 은 객체를 생성할 수 없음.※
	}

}
