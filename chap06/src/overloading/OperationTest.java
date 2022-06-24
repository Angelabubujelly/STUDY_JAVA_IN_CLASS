package overloading;

public class OperationTest {

	public static void main(String[] args) {
		Operation op = new Operation();
		op.plus(9);
		op.plus();
		op.plus(7,9);
		op.plus(4, "java");
	}

}
