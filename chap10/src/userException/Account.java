package userException;

public class Account {
	private int balance; //�ܾ� ���� ���ϰ� �س��� getBalance�� ����� �� �� �ְ� ��...
	
	public Account() { }//public �� ���� ���� ��Ű�� �Ȥ��ļ� ��ü�����Ͽ� ��� ����
		public int getBalance() {
			return balance;
		}
		public void deposit (int money) {
			balance += money;
		}
		public void withdraw(int money) throws BalanceInsufficientException01 {
			//���ܰ� �߻��ϸ� Exception�� �ƴ� �� Ŭ���� ȣ��????
			
			if (balance < money	) {
				//���ܰ� �߻��ϸ� ���� ������� Ŭ������ ��ü�� �����ϰ� �ȿ� �޽��� �Է�
//				System.out.println("�ܰ���� : "+(money-balance)+"���ڶ�");
				//else 
//				balanve -=money;
				throw new  BalanceInsufficientException01("�ܰ���� : "+(money-balance)+"���ڶ�");
				//throw ��ü �������Ѽ� ȣ�� ��Ű��
				//�� String�� �� �޽����� �Է����ִ°˴�
				
			}
			balance -= money;
		
	}
}
