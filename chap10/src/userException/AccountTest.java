package userException;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(); //Account 객체 생성
		
		try {
			account.withdraw(3000);
		} catch (BalanceInsufficientException01 e) { //내가 만들었던 Exception이 들어왕
			// TODO Auto-generated catch block
			String message = e.getMessage();
			//내가 입력한 메시지 출력됨...
			System.out.println(e.getMessage());
		}
		account.deposit(4000);
		System.out.println("현재 잔액: " + account.getBalance());
		try {
			account.withdraw(2000	);
		}catch (BalanceInsufficientException01 e) {
		System.out.println(e.getMessage());
		}
		System.out.println("현재 잔액" + account.getBalance());
	}

}
