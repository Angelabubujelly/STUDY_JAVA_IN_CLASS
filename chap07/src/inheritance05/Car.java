package inheritance05;

public class Car {
	//�ʵ�
//	Tire[]tiers = new Tire [4];
//	Tire[0] = new Tire("�տ���",6);
//	Tire[1] = new Tire("�տ�����",2);
//	Tire[2] = new Tire("�ڿާF",4);
//	Tire[3] = new Tire("�ڿ�����",3);
	
	Tire[] tires = {new Tire("�տ���",6), new Tire("�տ�����",2),new Tire("�ڿ���",4),new Tire("�ڿ�����",3)};

//������
//�޼ҵ�
	int run() { //�޸����� rollȣ���ؾ���...
		System.out.println("[�ڵ����� �޸��ϴ�.]"); 
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1; 	
		}
	}
	return 0; 
	}
void stop() {
	System.out.println("[�ڵ����� ����ϴ�.]");
}

}
