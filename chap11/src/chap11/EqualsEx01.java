package chap11;

public class EqualsEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value("��");
		Value v2 = new Value("��");
		
		System.out.println(v1);
		System.out.println(v2);
		
		if (v1 == v2)
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");
		
		if (v1.equals(v2))
			System.out.println("���� ����"); 
		else
			System.out.println("�ٸ� ����6");
	
	}
}

class Value {
	String value;
	Value (String value) {
		this.value = value;
	}
}