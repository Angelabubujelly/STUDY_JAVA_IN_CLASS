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
			System.out.println(location + "Tire ���� : "+ (maxRotation- accumulateRotation) + "ȸ");
			return true; //return�� ������ �� �޼ҵ�� ������...
		} else {
			System.out.println("��" + location + "Tire ��ũ ��");
		return false; //false�� ������ roll�� ������...
		}
	}
}
