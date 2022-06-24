package staticEx;

public class ProductMain {

	public static void main(String[] args) {
		
//			Product p1 = new Product();
//			Product p2 = new Product();
//			Product p3 = new Product();
//			Product p4 = new Product("연테라");
//			Product p5 = new Product();
	      
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println("P1의 제품번호 : " + p1.serialNo);
		System.out.println("P2의 제품번호 : " + p2.serialNo);
		System.out.println("P3의 제품번호 : " + p3.serialNo);
		System.out.println("P4의 제품번호 : " + p4.serialNo);
		System.out.println("생산된 총 제품의 수 : " + Product.count);
	}

	

}
