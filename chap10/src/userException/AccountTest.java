package userException;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(); //Account ��ü ����
		
		try {
			account.withdraw(3000);
		} catch (BalanceInsufficientException01 e) { //���� ������� Exception�� ����
			// TODO Auto-generated catch block
			String message = e.getMessage();
			//���� �Է��� �޽��� ��µ�...
			System.out.println(e.getMessage());
		}
		account.deposit(4000);
		System.out.println("���� �ܾ�: " + account.getBalance());
		try {
			account.withdraw(2000	);
		}catch (BalanceInsufficientException01 e) {
		System.out.println(e.getMessage());
		}
		System.out.println("���� �ܾ�" + account.getBalance());
	}

}
