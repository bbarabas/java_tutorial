package basics;

public class Weather {
	
	public static void main(String[] args) {
		
		//will give suggestions on what to wear
		//based on temperature
		//and sun condition
		
		
		int temperature = 17;
		String sunCondition = "Overcast";
		
		if (temperature > 25) {
			System.out.println("Wear shorts and Tshirt");
		} 
		else if ((temperature > 15) && (sunCondition == "Sunny")) {
			System.out.println("Wear a long sleeved shirt and jeans");
			System.out.println("Wear a hat");
		}
		else if ((temperature > 20) || (sunCondition == "Overcast")) {
			System.out.println("Cool day, wear normal clothes");
		} 
		else {
			System.out.println("Bring a sweater");
		}
		
		System.out.println("Program is ending");
	}

}
