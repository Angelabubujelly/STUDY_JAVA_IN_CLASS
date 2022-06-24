package inheritance06;

public class Buyer {

int money = 1000;
int bonusPoint; //= 0; 안 넣어줘도 인스턴스변수라 기본값 0

//void buy(Tv tv) {
//	
//}
//void buy(Computer com) { //Tv랑 자료형 달라!!
//	
//}~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


//Product p를 배열로 만들어보쟈뀨
Product item[] = new Product[10];

int i ;

void buy(Product p/*= new Tvor Com()) 였스..*/) { // tv넣어도 되고 computer넣어도 된느...
	 if(money<p.price) {
		 System.out.println("돈이 읎어서 못삽니당,.");
		 return;
	 }
	 money -= p.price;
	 bonusPoint += p.bonusPoint;

	 
	 item[i++] = p;
	 System.out.println(p + " 구입했습니당♡");
}
void listItem () {//메소둥~~
	String itemList = ""; //지역변수라 ""; 넣어줬삼\
	int sum = 0; //지역변수 스려면 초기화해줘야 해서 0 해쥼
	for(int i = 0; i<item.length; i++) {
		if (item[i]==null)
			break;
		itemList += "[" + item[i] + "] ";
		sum += item[i].price;
	}
	System.out.println("구입한 제품들 : " + itemList );
	System.out.println("구입한 총 금액 : " + sum);
	System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡"+"\n");
	
}
}
