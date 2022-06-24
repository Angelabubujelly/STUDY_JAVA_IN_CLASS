package polymorphism4;

public class HankookTire extends Tire {
	
	HankookTire(String location, int maxRotation) {
//				┌ 사용자가 값 넣으면 부모한테 전달할게용~
		super(location, maxRotation);
	}
	@Override
	boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "HanKookTire 수명 : "+ (maxRotation- accumulateRotation) + "회");
			return true; //return을 만나면 이 메소드는 끝난다...
		} else {
			System.out.println("※" + location + "HankookTire 펑크 ※");
		return false; //false를 만나면 roll은 끝난다...
		}
	}

}
