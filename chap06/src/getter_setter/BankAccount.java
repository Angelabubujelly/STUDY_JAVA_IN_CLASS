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
			System.out.println("입금할 수 없습니다.");
		} else {
			balance += money;
			System.out.println("입금됐습니다.");
		}
	}
	
	void withdraw(int money) {
		if (money<= balance) {
		balance -= money;
		System.out.println("출금됐습니다.");
		}else 
			System.out.println("잔액이 부족합니다.");
	}
	int getBalance() {
		return balance;
	}
}
