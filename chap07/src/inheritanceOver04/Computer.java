package inheritanceOver04;

public class Computer extends Calculator {
	@Override //@ crtrl + space bar 
	double areaCircle(double y) {
		System.out.println("Conputer ��ü�� areaCircle() ����");
		return Math.PI*y*y; //�������� �� �����~~ �ٸ� �������� ������ �Ȱ���~~!
	}
	
	
	
}
