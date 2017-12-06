package oop;

public class BankAccount {
	
	//define variables
	String accountNumber;
	//static
	//means that this value belongs to the class, not the particular obj,
	//it is true for each object
	//final is like a constant
	//often static final together
	
	//static variable
	private static final String rountingNumber = "03303";
	
	//instance variables
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	//contructor definition : unique methods
		//1. they are used to define or setup or intialize properties of an object
		//2. they are implicitly called upon instantiation
		//3. The same name as the class itself
		//4. Constructors have no return type
	BankAccount() { 
		System.out.println("new account created");
	}
	
	//overloading - call same method name with different argumets
	BankAccount(String accountType) {
		System.out.println("New account of type " + accountType);
	}
	BankAccount(String accountType, double initDeposit) {
		//initDeposit, account Type, msg are all local variables
		String msg = null;
		//System.out.println("New account of type " + accountType + " with init deposit of " + initDeposit + "$");
		if (initDeposit < 1000) {
			msg = "Error, init deposit must be larger than $1000";
		} else {
			msg = "Thanks for your initial deposit of $" + initDeposit;
		}
		balance = balance + initDeposit;
		System.out.println(msg);
	}
	
	
	//define methods
	//public >> available anywhere in the project
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}

	//default modifier >> available anywhere in the package
	//protected        >> same as default but also through inheritance
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
		
	//only available within the class
	private void showActivity(String activity) {
		System.out.println("Your recent activity: " + activity);
		System.out.println("Your new balance : $" + balance);
	}
	
	
	void checkBalance() {
		System.out.println("Balance is $" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[" + name + "." + accountNumber + "." + balance + " routing number : " + rountingNumber + "]";
	}
	
	
	
	
}
