package userException;

public class BalanceInsufficientException01 extends Exception { //상속 받아야 함!!
public BalanceInsufficientException01() { }
public BalanceInsufficientException01(String message) {
	super (message);
}
}
