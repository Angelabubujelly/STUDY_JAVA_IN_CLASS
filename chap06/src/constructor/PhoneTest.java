package constructor;

public class PhoneTest {

	public static void main(String[] args) {
		Phone p1 = new Phone(22.05);
		Phone p2 = new Phone();
		Phone p3 = new Phone("LG", "V50",100, 50.2);
	
		System.out.println("p1");
		System.out.println("ȸ���: " + p1.company + ", ��:" 
		+ p1.model + ", �ݾ�:" + p1.money + ", ����:	" + p1.ver);
		
		System.out.println("p2");
		System.out.println("ȸ���: " + p2.company + ", ��:" 
		+ p2.model + ", �ݾ�:" + p2.money + ", ����:	" + p2.ver);	
		
		System.out.println("p3");
		System.out.println("ȸ���: " + p3.company + ", ��:" 
		+ p3.model + ", �ݾ�:" + p3.money + ", ����: " + p3.ver);


	}

}
