package getter_setter;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();

		car1.setSpeed(-50); //�޼ҵ� ���ٿ�!!!
//		car1.speed =70;  speed�� private�̶� �ȉ�
		System.out.println(car1.getSpeed());
//		System.out.println(car1.speed); private���Ӷ�..
		
		car1.setSpeed(555);
		System.out.println(car1.getSpeed());
//		if (!car1.isStop()) {
//			car1.setStop(true); //! �� false�� true��..
//		}  ���� �����̻�...
			if (car1.isStop()) { //! �� false�� true��..
				car1.setStop(false);
				
		} else {
			car1.setStop(true);
		}
		System.out.println("���� �ӵ� : " + car1.getSpeed());
	}

}
