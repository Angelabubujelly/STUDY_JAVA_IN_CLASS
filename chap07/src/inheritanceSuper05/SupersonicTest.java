package inheritanceSuper05;

public class SupersonicTest {

	public static void main(String[] args) {
		SupersonicAirplane sup = new SupersonicAirplane();
		sup.takeOff();
		sup.fly();
		sup.flyMode = SupersonicAirplane.SUPERSONIC; //객체생성 안하고도 사용할 수 있음
		sup.fly();
		sup.flyMode = SupersonicAirplane.NORMAL;
		sup.fly();
		sup.land();

	}

}
