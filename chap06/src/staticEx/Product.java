package staticEx;

public class Product {
	
//	static int count; //��ǰ �ѹ��� ���� ����
//	int serialNo ;
//	String name; //��ǰ �̸�
//	
//	Product() {
//		this("������"+ ++count);
//	}
//	Product(String name){//���� ���� ��ǰ �̸� �ֱ�??
//		this.name = name;
//		System.out.println("��ǰ " + this.name + "��(��) �����ƽ��ϴ�.");
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