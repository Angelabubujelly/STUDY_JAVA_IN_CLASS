package wrapper;

public class BoxingUnBoxing01 {

	public static void main(String[] args) {
		//Boxing �� �⺻Ÿ���� ��üŸ������ ��ȯ
		int num = 100;
		Integer obj1 = new Integer(num);
		System.out.println(obj1);//override �ȵǸ� �ּҰ��� ���;� �Ǵµ� Integer���� �ż� Int�� ��ü Ÿ�� �Ű�����...
		String str = "200";
		Integer obj2 = new Integer(str);
		
		Integer obj3 = Integer.valueOf(str);
		Integer obj4 = Integer.valueOf(obj1);
		
		//unBoxing : ��üŸ���� �⺻�ڷ������� ��ȯ
		int value1 = obj3.intValue();  //��ü�� obj3�� int������ ��ȯ�Ͻÿ�.
		double value2 = obj4.doubleValue();
		
		System.out.println(value1);
		System.out.println(value2);
	
	}

}
