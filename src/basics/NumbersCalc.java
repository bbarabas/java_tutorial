package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		
		printName();
		
		int numA = 10;
		int numB = 20;
		
		addNumbers(numA, numB);
		
		int produs = multiplyNumbers(numA, numB);
		System.out.println("Product is " + multiplyNumbers(numA, numB));
	}
	
	static void printName() {
		System.out.println("My name is Tim");
	}
	
	
	static void addNumbers(int a, int b){
		int Sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is equal to " + Sum);
	}
	
	
	static int multiplyNumbers(int a, int b) {
		int product = a*b;
		return product;
		
	}
	
	
	
}
