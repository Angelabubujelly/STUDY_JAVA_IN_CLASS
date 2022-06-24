package singleton;

class Singleton {
	private static Singleton singleton = new Singleton(); //내 안에서 내 객체를 생성. 외부에선 못만듦
	private Singleton() /*얘가 없으면 밑에서도 객체생성 가능*/ {
		
	}
	static Singleton getInstance(){ /*객체 전체를 반환할 수 있다는 의미제*/
		return singleton;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); <-위에 프라이빗 싱글톤때문에 객체생성 불가
		//new 안 붙이면 주소 같음.
		Singleton s1 = Singleton.getInstance()	;
		Singleton s2 = Singleton.getInstance()	;
		if (s1 ==s2)/*주소가 같냐고 ㅋ*/ {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
	//사용자는 접근하지 못하지만 개발자는 접근할 수 있게 할 떄......,.,.,,.,.,.,.
		//new로 객체생성 할 수 없고 자기 내부에서만 생성하고, 접근할 수 있는 method...
	}

}
