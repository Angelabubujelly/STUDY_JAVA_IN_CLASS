package inheritance;
//�� �ʹ� ��մ� ^^*
//�ʵ��� ���...
class AA {
	int valueA = 1;
	int valueAa = 10;
	
	void setValue(int x, int y) { //�޼ҵ����!
		valueA = x;
		valueAa = y;
		System.out.println(valueA + "," + valueAa);
	}

}

class BB extends AA {
	int valueB;
	void sum() {
		valueB = valueA/*������ �����ϱ� �θ����� ���� Ȯ���ϻ�*/ + valueAa;
		System.out.println("�հ�: "+ valueB);
	}
} 

class CC extends AA {
	int valueC;
	void multi() {
		valueC = valueA*valueAa;
		System.out.println("����:" + valueC);
	}
}

//�θ��� ���� ��üó�� �����ϴ°� �ƴϰ� B�� �θ��� A�� C�� �θ��� A�� ������. �������� ����ϰ� ������ static�� �ٿ��� ��!!!!!!!!

public class InheritanceTest2 {

	public static void main(String[] args) { //main Ŭ������ �ö��...
		
		BB b1 = new BB(); //BB��� Ŭ���� ������ �ö��,, �ٵ� ��ӹ��� AA��� Ŭ������ �־ AA�� ���� �ö��...
						  //���ÿ� b1�̶�� ��ü, ��������� ������.
						 // BB�� ���� valueB�� AA�� ���� valueA�� valueAa�� �����,... Ŭ������ ��ü�� �־�߸� ����� �� ����..(?)
						 
						//�� ���� b1���� �޼ҵ带 �����غ��Կ�
		b1.sum();		//b1�� ����Ű�� �ִ� BB�� sum�� ��. ��� �ڿ� sum method�� ���� ����Ʈ�� ����.
		b1.setValue(100, 200); //b1�� ����Ű�� �ִ� BB�� ���⿡ AA�� ��. ���� setValue�� �����ϸ鼭 100,200�� �Ѱ���...���� ������.
		b1.sum(); //b1�� ����Ű�� �ִ� BB�� ���� �ٽ� ����� ��. �׸��� ����Ʈ ��.
		System.out.println();
		
		CC c1 = new CC();
		c1.multi();
		
	}

}
