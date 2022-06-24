package wrapper;

public class BoxingUnBoxing01 {

	public static void main(String[] args) {
		//Boxing 〓 기본타입을 객체타입으로 변환
		int num = 100;
		Integer obj1 = new Integer(num);
		System.out.println(obj1);//override 안되면 주소값이 나와야 되는데 Integer웅엥 돼서 Int형 객체 타입 돼가지궁...
		String str = "200";
		Integer obj2 = new Integer(str);
		
		Integer obj3 = Integer.valueOf(str);
		Integer obj4 = Integer.valueOf(obj1);
		
		//unBoxing : 객체타입을 기본자료형으로 변환
		int value1 = obj3.intValue();  //객체인 obj3을 int형으로 변환하시오.
		double value2 = obj4.doubleValue();
		
		System.out.println(value1);
		System.out.println(value2);
	
	}

}
