package polymorphism4;

public class HankookTire extends Tire {
	
	HankookTire(String location, int maxRotation) {
//				�� ����ڰ� �� ������ �θ����� �����ҰԿ�~
		super(location, maxRotation);
	}
	@Override
	boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "HanKookTire ���� : "+ (maxRotation- accumulateRotation) + "ȸ");
			return true; //return�� ������ �� �޼ҵ�� ������...
		} else {
			System.out.println("��" + location + "HankookTire ��ũ ��");
		return false; //false�� ������ roll�� ������...
		}
	}

}
