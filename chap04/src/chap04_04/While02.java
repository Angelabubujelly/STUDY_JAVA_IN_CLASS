package chap04_04;

import java.io.IOException;

public class While02 {

	public static void main(String[] args) {
		// ����Ű ^ -> 1���� �� .-> 1����
		boolean run = true;
		int speed = 0, keyCode = 0;
		
		while(run) /*run �� ���̱⿡ while ���� �������� ��� �� �� �� */{
			//System.in.read(); // Ű����� ���� ���� �о� �������ÿ�... scanner�� �����ŷ�...;;;;
			
			if(keyCode != 13 && keyCode!=10) {
				System.out.println("--------------------");
				System.out.println("1.���� | 2. ���� | 3. ���� ");
				System.out.println("---------------------");	
				System.out.println("���� : ");
			
			}
			try {
				keyCode = System.in.read(); //������ �� Ȯ���� �ֱ� ������ try catch������ �ٲ��شٴ� �޽����� ��ϴ�~~!
				if(keyCode ==49) {
					speed++;
					System.out.println("���� �ӵ� : " + speed);
				} else if(keyCode == 50) {
					speed--;
					System.out.println("���� �ӵ� : " + speed);
				} else if(keyCode == 51) {
					run = false;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���α׷� ����");

	}

}
