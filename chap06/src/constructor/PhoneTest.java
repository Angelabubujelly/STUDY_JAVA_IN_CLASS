package constructor;

public class PhoneTest {

	public static void main(String[] args) {
		Phone p1 = new Phone(22.05);
		Phone p2 = new Phone();
		Phone p3 = new Phone("LG", "V50",100, 50.2);
	
		System.out.println("p1");
		System.out.println("회사명: " + p1.company + ", 모델:" 
		+ p1.model + ", 금액:" + p1.money + ", 버전:	" + p1.ver);
		
		System.out.println("p2");
		System.out.println("회사명: " + p2.company + ", 모델:" 
		+ p2.model + ", 금액:" + p2.money + ", 버전:	" + p2.ver);	
		
		System.out.println("p3");
		System.out.println("회사명: " + p3.company + ", 모델:" 
		+ p3.model + ", 금액:" + p3.money + ", 버전: " + p3.ver);


	}

}
