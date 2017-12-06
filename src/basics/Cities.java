package basics;

public class Cities {
	
	public static void main(String[] args) {
		
		//declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		//System.out.println(cities[0]);
		//System.out.println(cities[1]);
		//System.out.println(cities[2]);
		//System.out.println(cities[3]);
		
		
		
		//declare athe array
		String[] countries;
		//define the array
		countries = new String[5];
		countries[0] = "Romania";
		//System.out.println(countries[0]);
		
		//declare and define the array(only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";

		int i = 0;
		
		//do loop enters the loopl then tests condition
		do {
			//System.out.println(states[i]);
			i++;
		} while (i < 5); 
		
		//while loop; tests condition first, then enters the loop 
		int c = 0;
		boolean stateFound = false;
		while ( !stateFound ) {
			//System.out.println(states[c]);
			String state = states[c];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State found");
				stateFound = true;
			}
			
			c++;
		}
		
		
		//for loop; best structure for iterating through an array
		System.out.println("PRINTING WITH FOR LOOP\n");
		for(int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}

}
