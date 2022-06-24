package userException;

public class Account {
	private int balance; //잔액 접근 못하게 해놔서 getBalance를 사용해 쓸 수 있게 함...
	
	public Account() { }//public 안 쓰면 같은 패키지 안ㅇㅔ서 객체생성하여 사용 가능
		public int getBalance() {
			return balance;
		}
		public void deposit (int money) {
			balance += money;
		}
		public void withdraw(int money) throws BalanceInsufficientException01 {
			//예외가 발생하면 Exception이 아닌 ↑ 클래스 호출????
			
			if (balance < money	) {
				//예외가 발생하면 내가 만들었던 클래스의 객체를 생성하고 안에 메시지 입력
//				System.out.println("잔고부족 : "+(money-balance)+"모자람");
				//else 
//				balanve -=money;
				throw new  BalanceInsufficientException01("잔고부족 : "+(money-balance)+"모자람");
				//throw 객체 생성시켜서 호출 시키고
				//그 String에 저 메시지를 입력해주는검당
				
			}
			balance -= money;
		
	}
}
