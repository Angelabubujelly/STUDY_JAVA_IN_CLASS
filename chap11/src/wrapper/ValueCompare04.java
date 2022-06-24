package wrapper;

public class ValueCompare04 {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100); //obj1 = 100; 는 100 이라는 값을 가진... 객 체 다
		Integer obj2 = new Integer(100); //Integer(100)얘넨 따로 생성된는거라 다른겨
	//	obj1 ==obj2 <- 객체의 주소가 같은가:?
System.out.println(obj1==obj2);
System.out.println(obj1.equals(obj2));

int value1 = obj1;
int value2 = obj2;
System.out.println(value1 == value2);
	}

}
