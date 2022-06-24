package getter_setter;

import java.util.Scanner;

public class BankAccountTest {
public static void main(String[] args) {

	BankAccount bank = new BankAccount();
	bank.deposit(0);
	bank.withdraw(5000);
	bank.withdraw(8000);
	System.out.println("ÇöÀç ÀÜ¾×: " + bank.getBalance());
	
	
	}

}
