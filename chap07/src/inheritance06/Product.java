package inheritance06;

public class Product {
	//�ʵ� 2��
	int price ;
	int bonusPoint;
	
	public Product (int price){
		this.price = price; //�ν��Ͻ� ������ ��ǰ�� �ݾ��� �־��ش�.
		bonusPoint = price/10; //�Ѵ� int�ϱ� �� ���h...
	}

}
