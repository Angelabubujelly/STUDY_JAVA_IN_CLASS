package normal;
class Elec {
	
}
class Tv extends Elec{
	
}

class Computer extends Elec {
	
}

class Audio extends Elec{
	
}

public class NormalTest01 {

	public static void main(String[] args) {
		
//		Tv tv = new Tv(); //��ü�� Tv��ü�� �θ��� Elec��ü  2���� ������ ��. ��� �޾����ϱ�!
//		Computer com = new Computer();
//		
//		 //�ڽ�Ÿ���� �θ�Ÿ������ �ִ´�.. ��� ���� �� �ִ�.. ���ϴ�...
//		Elec elec1 =tv; //�θ�Ÿ������ ����ȯ �Ҷ��� �ڵ� ����ȯ��
//		Elec elec2 = com; 
//		Elec elec3 = new Audio();
//		Elec elec4 = new Elec(); // Elect ��ü�� �����Ǿ��ְ� �ڽ��� ��ü�� �����Ǿ� ���� ����...
//		
//		 //�θ�Ÿ���� �ڽ�Ÿ������ ����ȯ �Ϸ��� ��������ȯ
//		//����1. �ݵ�� ó���� �ڽ�Ÿ������ ��ü�� �����Ǿ� �־�� �մϴ�. ó������ elec�Ǿ������� ����
//		//�տ� (Tv)�ٿ��� casting �������..
//		Tv tv1 = (Tv)elec1;
//	//	Tv tv2 = (Tv)elec4; tv��ü�� ���⶧���� ó������ �θ�ü�� ������� ��� ���� ����ȯ �� ��
//		Audio audio1 = (Audio)elec3; //�θ�Ÿ���� �ڽ�Ÿ������ ����ȯ����� �� ������
//
//		
//		Computer com2 = (Computer)elec3;
//		Elec elec4 = new Elec(); //�θ�Ÿ���� �θ�Ÿ�Կ� �ְ�...
		
		////////////////////////////////////////////////////////////////////////
		
		Tv tv = new Tv(); //��ü�� Tv��ü�� �θ��� Elec��ü  2���� ������ ��. ��� �޾����ϱ�!
		Elec elec1 =tv; //�θ�Ÿ������ ����ȯ �Ҷ��� �ڵ� ����ȯ��
		Tv tv1 = (Tv)elec1;
	
		Elec elec2 = new Elec();
		
		Tv tv2 = (Tv)elec2; //run ������ Exception �Ͼ

		

	}

}
