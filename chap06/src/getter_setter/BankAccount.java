package getter_setter;

public class BankAccount {
//	public int getmoney;
//	public int setMoney;
//	public int save;
//
//int getmoney() {
//	return save;
//}
//
//void setMoney(int save) {
//	if(save < 0) {
//		this.save=0;
//		return;
//	}else
//		this.save =save;
//}
//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

	
	private int balance;
	
	void deposit(int money) {
		if (money <= 0) {
			System.out.println("�Ա��� �� �����ϴ�.");
		} else {
			balance += money;
			System.out.println("�Աݵƽ��ϴ�.");
		}
	}
	
	void withdraw(int money) {
		if (money<= balance) {
		balance -= money;
		System.out.println("��ݵƽ��ϴ�.");
		}else 
			System.out.println("�ܾ��� �����մϴ�.");
	}
	int getBalance() {
		return balance;
	}
}
