package chap11;

public class EqualsEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value("¾Ó");
		Value v2 = new Value("¾Ó");
		
		System.out.println(v1);
		System.out.println(v2);
		
		if (v1 == v2)
			System.out.println("°°Àº °´Ã¼");
		else
			System.out.println("´Ù¸¥ °´Ã¼");
		
		if (v1.equals(v2))
			System.out.println("°°Àº ³»¿ë"); 
		else
			System.out.println("´Ù¸¥ ³»¿ë6");
	
	}
}

class Value {
	String value;
	Value (String value) {
		this.value = value;
	}
}