package inheritance06;

public class ProductTest {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		
		b1.buy(new Tv());
		b1.buy(new Computer());
		
		
		System.out.println("잔액 : " + b1.money + "만원");
		System.out.println("포인트 : "+ b1.bonusPoint + "점");
		b1.buy(new Tv());
		b1.buy(new HedgehogPlush());
		b1.buy(new Tv());
			
		System.out.println("\n"+"♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		b1.listItem();
		System.out.println("잔액 : " + b1.money + "만원");
		System.out.println("포인트 : "+ b1.bonusPoint + "점");
	
	}
	

}
