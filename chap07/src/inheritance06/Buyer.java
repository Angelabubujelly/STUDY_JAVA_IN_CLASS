package inheritance06;

public class Buyer {

int money = 1000;
int bonusPoint; //= 0; �� �־��൵ �ν��Ͻ������� �⺻�� 0

//void buy(Tv tv) {
//	
//}
//void buy(Computer com) { //Tv�� �ڷ��� �޶�!!
//	
//}~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


//Product p�� �迭�� �������
Product item[] = new Product[10];

int i ;

void buy(Product p/*= new Tvor Com()) ����..*/) { // tv�־ �ǰ� computer�־ �ȴ�...
	 if(money<p.price) {
		 System.out.println("���� ��� ����ϴ�,.");
		 return;
	 }
	 money -= p.price;
	 bonusPoint += p.bonusPoint;

	 
	 item[i++] = p;
	 System.out.println(p + " �����߽��ϴ碽");
}
void listItem () {//�޼ҵ�~~
	String itemList = ""; //���������� ""; �־����\
	int sum = 0; //�������� ������ �ʱ�ȭ����� �ؼ� 0 ����
	for(int i = 0; i<item.length; i++) {
		if (item[i]==null)
			break;
		itemList += "[" + item[i] + "] ";
		sum += item[i].price;
	}
	System.out.println("������ ��ǰ�� : " + itemList );
	System.out.println("������ �� �ݾ� : " + sum);
	System.out.println("����������������������������������������"+"\n");
	
}
}
