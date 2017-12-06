package basics;

public class SalaryCalculator {

		public static void main(String[] args) {
			
			//create a var to define our career
			//declare a var
			String career;
			System.out.println("Program is starting");
			
			//define a var
			career = "Sw Developer";
			System.out.println("My career is: " + career);
			
			//declare and define
			int hoursPerWeek = 40;
			int weeksPerYear = 50;
			double rate = 42.50;
			
			double salary = hoursPerWeek*weeksPerYear*rate;
			System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
			
			//compute annual salary
			// rate*hoursPerWeek*weeksPerYear
			
		}
}
