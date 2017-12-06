package basics;

public class Strings {

	public static void main(String[] args) {
		
		String bookTitle = "Lord of the rings";
		String wordChoice = "ring";
		String browser = "Chrome";
		
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word ring");
		}
		if (browser.equalsIgnoreCase("CHROME")) {
			 System.out.println("The browser is chrome");
		}
		
		String nume = "Barabas";
		String prenume = "Bogdan";
		String CNP = "1222222333333";
		
		//print intials plus last 4 digits of cnp
		System.out.println(prenume.substring(0, 1) + nume.substring(0, 1) + CNP.substring(9));
		
		System.out.println("there are " + CNP.length() + " digits in CNP");
		
	}
}
