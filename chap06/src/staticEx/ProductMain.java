package staticEx;

public class ProductMain {

	public static void main(String[] args) {
		
//			Product p1 = new Product();
//			Product p2 = new Product();
//			Product p3 = new Product();
//			Product p4 = new Product("���׶�");
//			Product p5 = new Product();
	      
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println("P1�� ��ǰ��ȣ : " + p1.serialNo);
		System.out.println("P2�� ��ǰ��ȣ : " + p2.serialNo);
		System.out.println("P3�� ��ǰ��ȣ : " + p3.serialNo);
		System.out.println("P4�� ��ǰ��ȣ : " + p4.serialNo);
		System.out.println("����� �� ��ǰ�� �� : " + Product.count);
	}

	

}
