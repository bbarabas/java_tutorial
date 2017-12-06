package basics;

public class Days {
	
	public static void main(String[] args) {
		//execute different block of code 
		//based on a condition
		
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
		case "Monday"   : 
			System.out.println("it's Mon");
			break;
		case "Tuesday"  : 
			System.out.println("it's Tue");
			break;
		case "Wednesday": 
			System.out.println("it's Wen");
			break;
		case "Thursday" : 
			System.out.println("it's Thu");
			break;
		case "Friday"   : 
			System.out.println("it's Fri");
			break;
		case "Saturday" : 
			System.out.println("it's Sat");
			break;
		case "Sunday"   : 
			System.out.println("it's Sun");
			break;
		
		}
	}
}
