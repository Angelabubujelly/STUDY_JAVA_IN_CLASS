package abstract03;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("����");
		FolderPhone fp = new FolderPhone("���߰�");
		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
	
		System.out.println("��������������������������������" + "\n");
		
		fp.turnOn();
		fp.camera();
		fp.turnOff();

		System.out.println("��������������������������������" + "\n");
				
		Phone phone = sp; //�θ� �ִ� method�� ���� ����
		phone.turnOff();
		phone.turnOn();
		
		System.out.println("��������������������������������" + "\n");

		//������� �迭 �� �˸� �����ϰ� �ٷ� ����� �� ����?
		// �ϴٺ��� �� �� �� �����ž�~~~��
		
		Phone phoneArr[] = new Phone [2]; 
		phoneArr[0]= new SmartPhone("����");
		phoneArr[1]= new SmartPhone("����");

		for(int i = 0; i<phoneArr.length; i++) {
			phoneArr[i].turnOn();
			phoneArr[i].turnOff();
		}
	
	}

}
