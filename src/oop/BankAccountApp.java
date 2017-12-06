package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "1234";
		acc1.name = "Barabas";
		acc1.balance = 10000;
		
		acc1.deposit(5000);
		acc1.withdraw(2000);

		System.out.println(acc1.toString());
		
		/*
		System.out.println(acc1.toString());
		BankAccount acc2 = new BankAccount("CheckingAccount");
		acc2.accountNumber = "1234";
		BankAccount acc3 = new BankAccount("CheckingAccount", 5000);
		acc3.accountNumber = "1234";
		System.out.println(acc1.rountingNumber);
		System.out.println(acc2.rountingNumber);
		System.out.println(acc3.rountingNumber);
		acc3.checkBalance();
		
		
		
		
		CDAccount cd1 = new CDAccount();
		cd1.interestRate = "5";
		cd1.name = "Juan";
		cd1.balance = 3000;
		cd1.accountNumber = "000007";
		cd1.toString();
		System.out.println(cd1.toString());
		cd1.compound();
		
		*/

	}

}
