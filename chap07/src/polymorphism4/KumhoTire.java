package polymorphism4;

public class KumhoTire extends Tire {
	
	KumhoTire(String location, int maxRotation) {
//				┌ 사용자가 값 넣으면 부모한테 전달할게용~
		super(location, maxRotation);
	}
	@Override
	boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "KumhoTire 수명 : "+ (maxRotation- accumulateRotation) + "회");
			return true; //return을 만나면 이 메소드는 끝난다...
		} else {
			System.out.println("※" + location + "KumhoTire 펑크 ※");
		return false; //false를 만나면 roll은 끝난다...
		}
	}

}
