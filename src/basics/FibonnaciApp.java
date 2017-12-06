package basics;

public class FibonnaciApp {
	
	public static void main(String[] args) {
		//fib(o) = 0;
		//fib(1) = 1;
		//fib(2) = fib(0) + fib(1);
		//System.out.println(fib(0));
		//System.out.println(fib(1));
		//System.out.println(fib(5));

		
		for(int x = 0; x<11 ; x++) {
			System.out.println(sum(x));
		}
		
		int[] example = { -2000, 3, 61, -5, 2000};
		System.out.println(findMin(example));
		System.out.println(findMax(example));
		System.out.println(findAverage(example));
		
	}
	
	public static int fib(int n) {
		
		if ( n == 0) {
			return 0;
		} else if ( n==1 ) {
			return 1;
		}
		
		//recursion
		return (fib(n-1) + fib(n-2));
	}	
	
	
	//ex.1 
		public static int sum(int n) {
			
			if( n == 0 ) {
				return 0;
			}
			
			return n+sum(n-1);
		}
		
	
	//ex.2
	public static int fact(int n) {
		
		if( n == 0 ) {
			return 1;
		} 
		
		return n*fact(n-1);

	}
	
	//ex.3
	public static int findMin(int[] x) {
		int min = x[0];
		for(int i = 0; i < x.length ; i++) {
			if (x[i] < min) {
				min = x[i];
			}
		}
		
		return min;
	}
	
	public static int findMax(int[] x) {
		int max = x[0];
		for(int i = 0; i < x.length ; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		
		return max;
	}
	
	public static float findAverage(int[] x) {
		float sum = 0;
		for(int i = 0; i < x.length ; i++) {
			sum = sum + x[i];
		}
		
		return (sum/x.length);
	}
	
	


}
