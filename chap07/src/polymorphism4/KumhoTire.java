package polymorphism4;

public class KumhoTire extends Tire {
	
	KumhoTire(String location, int maxRotation) {
//				�� ����ڰ� �� ������ �θ����� �����ҰԿ�~
		super(location, maxRotation);
	}
	@Override
	boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "KumhoTire ���� : "+ (maxRotation- accumulateRotation) + "ȸ");
			return true; //return�� ������ �� �޼ҵ�� ������...
		} else {
			System.out.println("��" + location + "KumhoTire ��ũ ��");
		return false; //false�� ������ roll�� ������...
		}
	}

}
