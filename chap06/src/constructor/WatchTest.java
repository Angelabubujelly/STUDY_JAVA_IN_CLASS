package constructor;

public class WatchTest {

	public static void main(String[] args) {
		Watch w1 = new Watch(); //아무것도 안 넣으면 개체를 생성하는거예용. null null루
		System.out.println("w1");
		System.out.println("종류: "+w1.kind + ", 모델: "+ w1.model);
		
		Watch w2 = new Watch("벽시계");
		System.out.println("종류: "+w2.kind + ", 모델: "+ w2.model);
		
		Watch w3 = new Watch("탁상시계", "티쏘");
		System.out.println("종류: "+ w3.kind + ", 모델: "+ w3.model);

		Watch2 w2_1 = new Watch2("벽시계");
		System.out.println(w2_1.kind+ "," +                w2_1.model);
		
		Watch2 w2_2 = new Watch2("군인시계", "구찌");
		System.out.println(w2_2.kind + "," + w2_2.model);
	
	}

}
