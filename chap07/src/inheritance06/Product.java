package inheritance06;

public class Product {
	//필드 2개
	int price ;
	int bonusPoint;
	
	public Product (int price){
		this.price = price; //인스턴스 변수에 제품의 금액을 넣어준다.
		bonusPoint = price/10; //둘다 int니까 몫만 남긤...
	}

}
