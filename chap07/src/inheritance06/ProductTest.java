package inheritance06;

public class ProductTest {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		
		b1.buy(new Tv());
		b1.buy(new Computer());
		
		
		System.out.println("�ܾ� : " + b1.money + "����");
		System.out.println("����Ʈ : "+ b1.bonusPoint + "��");
		b1.buy(new Tv());
		b1.buy(new HedgehogPlush());
		b1.buy(new Tv());
			
		System.out.println("\n"+"����������������������������������������");
		b1.listItem();
		System.out.println("�ܾ� : " + b1.money + "����");
		System.out.println("����Ʈ : "+ b1.bonusPoint + "��");
	
	}
	

}
