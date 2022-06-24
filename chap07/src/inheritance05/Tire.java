package inheritance05;
 
public class Tire {
	int maxRotation;
	int accumulateRotation;
	String location;
	
	Tire (String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	
	}
	boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "Tire 수명 : "+ (maxRotation- accumulateRotation) + "회");
			return true; //return을 만나면 이 메소드는 끝난다...
		} else {
			System.out.println("※" + location + "Tire 펑크 ※");
		return false; //false를 만나면 roll은 끝난다...
		}
	}
}
