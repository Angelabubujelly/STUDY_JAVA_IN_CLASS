package inheritanceSuper05;

public class SupersonicTest {

	public static void main(String[] args) {
		SupersonicAirplane sup = new SupersonicAirplane();
		sup.takeOff();
		sup.fly();
		sup.flyMode = SupersonicAirplane.SUPERSONIC; //��ü���� ���ϰ� ����� �� ����
		sup.fly();
		sup.flyMode = SupersonicAirplane.NORMAL;
		sup.fly();
		sup.land();

	}

}
