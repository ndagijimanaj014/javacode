package Javacode;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		 int n = 10; // Number of terms to display
	        int firstTerm = 0, secondTerm = 1;
	        System.out.println("Fibonacci Series till " + n + " terms:");

	        for (int i = 1; i <= n; ++i) {
	          

	            // Compute the next term
	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	            System.out.print(firstTerm + ", ");
	            //Fibonacci Series till 10 terms:
	            //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
	        }
	}

}
