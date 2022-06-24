package staticEx;

public class Product {
	
//	static int count; //제품 넘버를 세기 위헤
//	int serialNo ;
//	String name; //제품 이름
//	
//	Product() {
//		this("증류주"+ ++count);
//	}
//	Product(String name){//내가 넣은 제품 이름 넣기??
//		this.name = name;
//		System.out.println("제품 " + this.name + "이(가) 주조됐습니다.");
//		}
//	
//       Product(int count){
//    	   for(int i = 0 ; i<count.length; i++){
//	            sum+=count[i];
//       }
	static int count;
	int serialNo;
	String name;
	
	Product (){
		++count;
		serialNo = count;
	}

         }