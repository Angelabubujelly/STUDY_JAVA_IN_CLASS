package wrapper;

public class ValueCompare04 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100); //obj1 = 100; �� 100 �̶�� ���� ����... �� ü ��
		Integer obj2 = new Integer(100); //Integer(100)��� ���� �����ȴ°Ŷ� �ٸ���
	//	obj1 ==obj2 <- ��ü�� �ּҰ� ������:?
System.out.println(obj1==obj2);
System.out.println(obj1.equals(obj2));

int value1 = obj1;
int value2 = obj2;
System.out.println(value1 == value2);
	}

}
