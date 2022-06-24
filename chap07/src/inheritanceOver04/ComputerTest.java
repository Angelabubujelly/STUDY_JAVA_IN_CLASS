package inheritanceOver04;

public class ComputerTest {

	public static void main(String[] args) {
	Computer com1 = new Computer(); //°´Ã¼»ý¼º
	
	System.out.println(com1.areaCircle(5));
	
	Calculator cal1 = new Calculator();
	System.out.println(cal1.areaCircle(10));
	System.out.println(com1.areaCircle(10));
	}

}
